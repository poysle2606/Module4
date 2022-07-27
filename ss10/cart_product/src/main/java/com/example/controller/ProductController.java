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

import javax.jws.WebParam;
import java.util.Optional;

@Controller
@SessionAttributes("cart") //khai báo session tên là cart.
@RequestMapping("/shop")
public class ProductController {

    // khởi tạo giá trị cho session
    @ModelAttribute("cart")
    public CartDto initCartDto(){
        return new CartDto();
    }

    @Autowired
    IProductService iProductService;

    @GetMapping("")
    public String listProduct(Model model){
        model.addAttribute("product",iProductService.findAll());
        return "list";
    }

    @GetMapping("/add/{id}")
    public String detailProduct(@PathVariable int id,@SessionAttribute ("cart") CartDto cartDto){
        Optional<MyProduct> product = iProductService.findById(id);
        if(product.isPresent()){
            ProductDto productDto = new ProductDto();
            BeanUtils.copyProperties(productDto,product);

            cartDto.addProduct(productDto);
        }
        return "redirect:/cart";
    }
}
