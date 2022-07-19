package com.example.controller;

import com.example.service.IProductService;
import com.example.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/product")
public class ProductController {

    IProductService iProductService = new ProductService();

    @GetMapping("")
    public String list(Model model) {
        model.addAttribute("product",iProductService.findAll());
        return "/list";
    }

    @GetMapping("/delete/{id}")
    public String deleteForm(@PathVariable Integer id, Model model){
        model.addAttribute("product",iProductService.findById(id));
        return "/delete";
    }

    @PostMapping("/delete/{id}")
    public String deleteProduct(@PathVariable Integer id){
        iProductService.delete(id);
        return "redirect:/product";
    }

    @GetMapping("/search")
    public String search(@RequestParam String name, Model model){
        model.addAttribute("product",iProductService.findByName(name));
        return "/list";
    }
}
