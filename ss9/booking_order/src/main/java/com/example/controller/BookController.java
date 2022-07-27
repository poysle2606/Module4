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
    public String view(@PathVariable int id, Model model) {
        Book book = iBookService.findById(id);
        model.addAttribute("book", book);
        return "/view";
    }

    @PostMapping("/booking")
    public String orderBook(@RequestParam int id,@ModelAttribute UserOrder userOrder, RedirectAttributes redirectAttributes) {
       Book book = iBookService.findById(id);
       if (book.getAmount() == 0){
           redirectAttributes.addFlashAttribute("mess", "Hết sách để mượn");
       } else {
           book.setAmount(book.getAmount() - 1);
           iBookService.save(book);
           redirectAttributes.addFlashAttribute("mess","Mượn sách thành công.");
       }
        return "redirect:/book";
    }
}
