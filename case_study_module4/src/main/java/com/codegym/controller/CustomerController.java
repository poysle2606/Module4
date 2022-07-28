package com.codegym.controller;

import com.codegym.dto.CustomerDto;
import com.codegym.model.customer.Customer;
import com.codegym.repository.customer.ICustomerTypeRepository;
import com.codegym.service.customer.ICustomerService;
import com.codegym.service.customer.ICustomerTypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    ICustomerService iCustomerService;

    @Autowired
    ICustomerTypeService iCustomerTypeService;

    @GetMapping("")
    public String listCustomer(@PageableDefault(value = 5) Pageable pageable, Model model) {
        model.addAttribute("customer", iCustomerService.findAll(pageable));
        return "/customer/list";
    }

    @GetMapping("/create")
    public String createForm(Model model) {
        model.addAttribute("customerType", iCustomerTypeService.findAll());
        model.addAttribute("customer", new Customer());
        return "/customer/create";
    }

    @PostMapping("/save")
    public String createCustomer(@ModelAttribute Customer customer, RedirectAttributes redirectAttributes, Model model) {
        model.addAttribute("customerType", iCustomerTypeService.findAll());
        iCustomerService.create(customer);
        redirectAttributes.addFlashAttribute("mess", "Create Customer success");
        return "redirect:/customer";
    }
}
