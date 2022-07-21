package com.example.blogger.controller;

import com.example.blogger.model.Blogger;
import com.example.blogger.service.IBloggerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/blogger")
public class BloggerController {

    @Autowired
    IBloggerService iBloggerService;

    @GetMapping("")
    public String list(Model model) {
        List<Blogger> blogList = iBloggerService.findAll();
        model.addAttribute("blogList", blogList);
        return "/blog";
    }

    @GetMapping("/create")
    public String createForm(Model model) {
        model.addAttribute("blogList", new Blogger());
        return "/create";
    }

    @PostMapping("/save")
    public String createBlog(@ModelAttribute Blogger blogger, RedirectAttributes redirectAttributes){
        iBloggerService.create(blogger);
        redirectAttributes.addFlashAttribute("mess","Create new Blog success");
        return "redirect:/blogger";
    }

    @GetMapping("/edit/{id}")
    public String editForm(@PathVariable int id,Model model){
        Blogger blogger = iBloggerService.findById(id);
        model.addAttribute("blogList",blogger);
        return "/edit";
    }

    @PostMapping("/update")
    public String editBlog(Blogger blogger,RedirectAttributes redirectAttributes){
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
}
