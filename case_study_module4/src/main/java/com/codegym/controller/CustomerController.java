package com.codegym.controller;

import com.codegym.model.customer.Customer;
import com.codegym.service.customer.ICustomerService;
import com.codegym.service.customer.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

//    @PostMapping("/create")
//    public String createCustomer(@Validated @ModelAttribute("customer") CustomerDto customerDto,
//                                 RedirectAttributes redirectAttributes, Model model, BindingResult bindingResult) {
//        if (bindingResult.hasErrors()) {
//            return "/customer/create";
//        } else {
//            Customer customer = new Customer();
//            BeanUtils.copyProperties(customerDto,customer);
//            model.addAttribute("customerType", iCustomerTypeService.findAll());
//            iCustomerService.create(customer);
//            redirectAttributes.addFlashAttribute("mess", "Create Customer success");
//            return "redirect:/customer";
//        }
//    }

    @PostMapping("/save")
    public String createCustomer(@ModelAttribute Customer customer, RedirectAttributes redirectAttributes, Model model) {
        model.addAttribute("customerType", iCustomerTypeService.findAll());
        iCustomerService.create(customer);
        redirectAttributes.addFlashAttribute("mess", "Create Customer success");
        return "redirect:/customer";
    }

    @GetMapping("/edit/{id}")
    public String editForm(@PathVariable int id, Model model) {
        Customer customer = iCustomerService.findById(id);
        model.addAttribute("customerType", iCustomerTypeService.findAll());
        model.addAttribute("customer", customer);
        return "/customer/edit";
    }

    @PostMapping("/update")
    public String updateCustomer(@ModelAttribute("customer") Customer customer, RedirectAttributes redirectAttributes) {
        iCustomerService.update(customer);
        redirectAttributes.addFlashAttribute("mess", "Cập nhật dữ liệu thành công.");
        return "redirect:/customer";
    }

    @GetMapping("/delete")
    public String deleteCustomer(@RequestParam int id, RedirectAttributes redirectAttributes) {
        iCustomerService.delete(id);
        redirectAttributes.addFlashAttribute("mess", "Xóa khách hàng thành công");
        return "redirect:/customer";
    }

    @GetMapping("/search")
    public String searchCustomer(@RequestParam ("word") String word, @PageableDefault (value = 5) Pageable pageable, Model model){
        model.addAttribute("customer",iCustomerService.findByName(pageable,word));
        return "/customer/list";
    }
}
