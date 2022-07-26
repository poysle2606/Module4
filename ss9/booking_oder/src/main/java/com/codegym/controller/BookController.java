package com.codegym.controller;

import com.codegym.model.Book;
import com.codegym.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    IBookService iBookService;

    @GetMapping("")
    public String list(Model model){
        model.addAttribute("book",iBookService.findAll());
        return "/list";
    }

    @GetMapping("/view/{idBook}")
    public String view(@PathVariable ("idBook") int idBook, Model model){
        Book book = iBookService.findById(idBook);
        model.addAttribute("book",book);
        return "/view";
    }

}
