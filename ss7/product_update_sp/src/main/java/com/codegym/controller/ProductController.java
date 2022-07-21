package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;


@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    IProductService iProductService;

    @GetMapping("")
    public String list(@PageableDefault(value = 2) Pageable pageable , Model model){
        model.addAttribute("product",iProductService.findAll(pageable));
        return "/list";
    }

    @GetMapping("/create")
    public String createForm(Model model){
        model.addAttribute("product",new Product());
        return "/create";
    }

    @PostMapping("/save")
    public String createProduct(Product product, RedirectAttributes redirectAttributes){
        iProductService.create(product);
        redirectAttributes.addFlashAttribute("mess","Create success");
        return "redirect:/product";
    }

    @GetMapping("/edit/{id}")
    public String editForm(@PathVariable Integer id, Model model){
       Product product = iProductService.findById(id);
       model.addAttribute("product",product);
       return "/edit";
    }

    @PostMapping("/update")
    public String editProduct(Product product, RedirectAttributes redirectAttributes){
        iProductService.edit(product);
        redirectAttributes.addFlashAttribute("mess","Update success");
        return "redirect:/product";
    }

    @PostMapping("/delete")
    public String deleteProduct(@RequestParam Integer id, RedirectAttributes redirectAttributes) {
        iProductService.delete(id);
        redirectAttributes.addFlashAttribute("mess", "Delete success");
        return "redirect:/product";
    }

    @GetMapping("/view/{id}")
    public String viewProduct(@PathVariable Integer id, Model model){
        Product product = iProductService.findById(id);
        model.addAttribute("products",product);
        return "/view";
    }

    @GetMapping("/search")
    public String search(@RequestParam ("word") String word, Model model){
        List<Product> products = iProductService.findName(word);
        model.addAttribute("product",products);
        return "/list";
    }
}
