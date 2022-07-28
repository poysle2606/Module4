package com.example.controller;

import com.example.dto.CartDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CartController {

    @ModelAttribute("cart")
    public CartDto setupCart() {
        return new CartDto();
    }

    @GetMapping("/shopping")
    public ModelAndView showCart(@SessionAttribute(value = "cart", required = false) CartDto cartDto) {
        ModelAndView modelAndView = new ModelAndView("/cart");
        modelAndView.addObject("cart", cartDto);
        return modelAndView;
    }
}
