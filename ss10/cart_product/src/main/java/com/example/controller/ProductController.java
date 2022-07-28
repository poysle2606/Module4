package com.example.controller;

import com.example.dto.CartDto;
import com.example.dto.ProductDto;
import com.example.model.MyProduct;
import com.example.service.IProductService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
@SessionAttributes("cart") //khai báo session tên là cart.
@RequestMapping("/shop")
public class ProductController {

    // khởi tạo giá trị cho session
    @ModelAttribute("cart")
    public CartDto initCartDto() {
        return new CartDto();
    }

    @Autowired
    IProductService iProductService;

    @GetMapping("")
    public String listProduct(Model model) {
        model.addAttribute("product", iProductService.findAll());
        return "list";
    }

    @GetMapping("/add/{id}")
    public String detailProduct(@PathVariable int id, @SessionAttribute("cart") CartDto cartDto, @RequestParam("action") String action) {
        Optional<MyProduct> productOptional = iProductService.findById(id);
        if (!productOptional.isPresent()) {
            return "/error";
        }
        if (action.equals("show")) {
            cartDto.addProduct(productOptional.get());
            return "redirect:/shopping";
        }
        cartDto.addProduct(productOptional.get());
        return "redirect:/shop";
    }

    @GetMapping("/remove/{id}")
    public String removeProduct(@PathVariable int id, @SessionAttribute("cart") CartDto cartDto, @RequestParam("action") String action) {
        Optional<MyProduct> productOptional = iProductService.findById(id);
        if (!productOptional.isPresent()) {
            return "/error";
        }
        if (action.equals("show")) {
            cartDto.remove(productOptional.get());
            return "redirect:/shopping";
        }
        cartDto.remove(productOptional.get());
        return "redirect:/shop";
    }
}
