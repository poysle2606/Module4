package com.codegym.controller;

import com.codegym.model.Category;
import com.codegym.service.ICategoryService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    ICategoryService iCategoryService;

    @GetMapping("")
    public String listCategory(@PageableDefault(value = 2) Pageable pageable, Model model) {
        model.addAttribute("category", iCategoryService.findAll(pageable));
        return "/category";
    }

    @GetMapping("/create")
    public String createForm(Model model) {
        model.addAttribute("category", new Category());
        return "/create_category";
    }

    @PostMapping("/save")
    public String createCategory(@ModelAttribute Category category, RedirectAttributes redirectAttributes) {
        iCategoryService.create(category);
        redirectAttributes.addFlashAttribute("mess","Create Category success");
        return "redirect:/category";
    }

    @GetMapping("/edit/{id}")
    public String editForm(@PathVariable int id, Model model){
        Category category = iCategoryService.findById(id);
        model.addAttribute("category",category);
        return "/edit_category";
    }

    @PostMapping("/update")
    public String editCategory(Category category, RedirectAttributes redirectAttributes){
        iCategoryService.edit(category);
        redirectAttributes.addFlashAttribute("mess","Update Category success");
        return "redirect:/category";
    }

    @PostMapping("/delete")
    public String delete(@RequestParam int id, RedirectAttributes redirectAttributes){
        iCategoryService.delete(id);
        redirectAttributes.addFlashAttribute("mess","Delete Category success");
        return "redirect:/category";
    }

    @GetMapping("/search")
    public String search(@PageableDefault(value = 2) Pageable pageable,@RequestParam("search") String name, Model model) {
        model.addAttribute("category", iCategoryService.search(pageable,name));
        return "/category";
    }

}
