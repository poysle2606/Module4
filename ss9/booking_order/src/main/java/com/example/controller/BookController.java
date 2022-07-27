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
        model.addAttribute("user", new UserOrder());
        model.addAttribute("book", iBookService.findAll());
        return "/list";
    }

    @GetMapping("/view/{id}")
    public String view(@PathVariable int id, Model model) {
        Book book = iBookService.findById(id);
        model.addAttribute("book", book);
        return "/view";
    }

    @GetMapping("/order")
    public String orderForm(Model model) {
        model.addAttribute("book", iBookService.findAll());
        model.addAttribute("user", new UserOrder());
        return "order";
    }

    @PostMapping("/save")
    public String bookOrder(@ModelAttribute UserOrder user, RedirectAttributes redirectAttributes) throws Exception {
        Book book = iBookService.findById(user.getBook().getId());

        if (book.getAmount() == 0) {
            throw new Exception();
        } else {
            book.setAmount(book.getAmount() - 1);

            iBookService.save(book);

            iUserOrderService.save(user);

            redirectAttributes.addFlashAttribute("mess", "Mượn sách thành công");
        }
        return "redirect:/book";
    }

    @PostMapping("/remove")
    public String bookReturn(@RequestParam long code, RedirectAttributes redirectAttributes) throws Exception {
        UserOrder userOrder = iUserOrderService.findByCode(code);
        if (userOrder == null) {
            throw new NullPointerException();
        } else {
            userOrder.getBook().setAmount(userOrder.getBook().getAmount() + 1);

            iUserOrderService.delete(userOrder);

            redirectAttributes.addFlashAttribute("mess", "Trả sách thành công");
        }
        return "redirect:/book";
    }

    @ExceptionHandler(Exception.class)
    public String errorPage() {
        return "error";
    }
    @ExceptionHandler(NullPointerException.class)
    public String errorPage1() {
        return "error1";
    }

}
