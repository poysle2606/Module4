package com.example.controller;

import com.example.model.Product;
import com.example.service.IProductService;
import com.example.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/product")
public class ProductController {

    IProductService iProductService = new ProductService();

    @GetMapping("")
    public String listProduct(Model model) {
        model.addAttribute("product", iProductService.findAll());
        return "/list";
    }

    @GetMapping("/create")
    public String createForm(Model model) {
        model.addAttribute("product", new Product());
        return "/create";
    }

    @PostMapping("/create")
    public String createProduct(Product product) {
        iProductService.create(product);
        return "redirect:/product";
    }

    @GetMapping("/view/{id}")
    public String viewProduct(@PathVariable Integer id, Model model){
        model.addAttribute("products",iProductService.findById(id));
        return "/view";
    }

    @GetMapping("/edit/{id}")
    public String editForm(@PathVariable Integer id, Model model){
        model.addAttribute("product",iProductService.findById(id));
        return "/edit";

    }

    @PostMapping("/edit/{id}")
    public String editProduct(@PathVariable Integer id, Product product){
        iProductService.edit(product, id);
        return "redirect:/product";
    }
}
