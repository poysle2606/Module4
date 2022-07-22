package com.codegym.controller;

import com.codegym.model.Blogger;
import com.codegym.model.Category;
import com.codegym.service.IBloggerService;
import com.codegym.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Date;

@Controller
@RequestMapping("/blogger")
public class BloggerController {

    @Autowired
    IBloggerService iBloggerService;

    @Autowired
    ICategoryService iCategoryService;

    @GetMapping("")
    public String list(@PageableDefault(value = 3) Pageable pageable, Model model) {
        Page<Blogger> blogList = iBloggerService.findAll(pageable);
        model.addAttribute("blogList", blogList);
        return "/blog";
    }

    @GetMapping("/create")
    public String createForm(Model model, Pageable pageable) {
        model.addAttribute("blogList", new Blogger());
        Page<Category> categories = iCategoryService.findAll(pageable);
        model.addAttribute("categoryList", categories);
        return "/create";
    }

    @PostMapping("/save")
    public String createBlog(@ModelAttribute Blogger blogger, RedirectAttributes redirectAttributes){
        blogger.setDayStart(new Date(System.currentTimeMillis()));
        iBloggerService.create(blogger);
        redirectAttributes.addFlashAttribute("mess","Create new Blog success");
        return "redirect:/blogger";
    }

    @GetMapping("/edit/{id}")
    public String editForm(@PathVariable int id,Model model,Pageable pageable){
        Page<Category> categories = iCategoryService.findAll(pageable);
        model.addAttribute("categoryList",categories);
        Blogger blogger = iBloggerService.findById(id);
        model.addAttribute("blogList",blogger);
        return "/edit";
    }

    @PostMapping("/update")
    public String editBlog(Blogger blogger,RedirectAttributes redirectAttributes){
        blogger.setDayStart(new Date(System.currentTimeMillis()));
        iBloggerService.edit(blogger);
        redirectAttributes.addFlashAttribute("mess","Update success");
        return "redirect:/blogger";
    }

    @PostMapping("/delete")
    public String delete(@RequestParam int id, RedirectAttributes redirectAttributes){
        iBloggerService.delete(id);
        redirectAttributes.addFlashAttribute("mess","Delete success");
        return "redirect:/blogger";
    }

    @GetMapping("/search")
    public String searchName(@RequestParam("search") String name,@PageableDefault(value = 3) Pageable pageable, Model mode){
        mode.addAttribute("blogList",iBloggerService.search(pageable,name));
        return "/blog";
    }

    @GetMapping("/view/{id}")
    public String viewBlog(@PathVariable int id, Model model){
        Blogger blogger = iBloggerService.findById(id);
        model.addAttribute("blog",blogger);
        return "/view";
    }

}
