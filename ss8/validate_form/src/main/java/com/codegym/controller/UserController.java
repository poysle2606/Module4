package com.codegym.controller;

import com.codegym.model.User;
import com.codegym.dto.UserDto;
import com.codegym.service.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    IUserService iUserService;

    @GetMapping("/create")
    public String form(Model model){
        model.addAttribute("user",new UserDto());
        return "/form";
    }

    @PostMapping("/create")
    public String create(@Validated @ModelAttribute("user")UserDto userDto, BindingResult bindingResult,
                         RedirectAttributes redirectAttributes){
        if(bindingResult.hasErrors()){
            return "/form";
        }
        else {
            User user = new User();
            BeanUtils.copyProperties(userDto,user);
            iUserService.create(user);
            redirectAttributes.addFlashAttribute("mess","Welcome" + user.getFirstName() + " " + user.getLastName());
            return "/result";
        }
    }
}
