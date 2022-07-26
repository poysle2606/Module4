package com.example.controller;

import com.example.model.Book;
import com.example.model.UserOrder;
import com.example.service.IBookService;
import com.example.service.IUserOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    IBookService iBookService;

    @Autowired
    IUserOrderService iUserOrderService;

    @GetMapping("")
    public String list(Model model) {
        model.addAttribute("book", iBookService.findAll());
        return "/list";
    }

    @GetMapping("/view/{id}")
    public String view(@PathVariable Integer id, Model model) {
        Book book = iBookService.findById(id);
        model.addAttribute("book", book);
        return "/view";
    }

    @GetMapping("/booking/{id}")
    public String orderBook(@PathVariable int id, RedirectAttributes redirectAttributes) {
        UserOrder userOrder = new UserOrder();
        long code = (long) (Math.random() * (99999 - 10000) + 10000);
        userOrder.setCode(code);

        long millis = System.currentTimeMillis();
        userOrder.setDate(new java.sql.Date(millis));

        Book book = iBookService.findById(id);
        book.setAmount(book.getAmount() - 1);

        Set<UserOrder> orders = book.getOrders();
        orders.add(userOrder);
        book.setOrders(orders);

        iUserOrderService.save(userOrder);
        iBookService.save(book);
        redirectAttributes.addFlashAttribute("mess","Mượn sách thành công.");
        return "redirect:/book";
    }
}
