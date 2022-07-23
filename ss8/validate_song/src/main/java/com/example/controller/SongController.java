package com.example.controller;

import com.example.dto.SongDto;
import com.example.model.Song;
import com.example.service.ISongService;
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
@RequestMapping("/song")
public class SongController {

    @Autowired
    ISongService iSongService;

    @GetMapping("")
    public String list(Model model){
        model.addAttribute("song",iSongService.findAll());
        return "/list";
    }

    @GetMapping("/create")
    public String createForm(Model model){
        model.addAttribute("song",new SongDto());
        return "/create";
    }

    @PostMapping("/create")
    public String createSong(@Validated @ModelAttribute("song")SongDto songDto, BindingResult bindingResult,
                             RedirectAttributes redirectAttributes){
        if(bindingResult.hasErrors()){
            return "/create";
        } else {
            Song song = new Song();
            BeanUtils.copyProperties(songDto,song);
            iSongService.create(song);
            redirectAttributes.addFlashAttribute("mess","Create new song success");
            return "redirect:/song";
        }
    }

    @GetMapping("/edit")
    public String editForm(Model model){
        model.addAttribute("song",new SongDto());
        return "/edit";
    }

    @PostMapping("/save")
    public String editSong(@Validated @ModelAttribute("song")SongDto songDto, BindingResult bindingResult,
                           RedirectAttributes redirectAttributes){
        if(bindingResult.hasErrors()){
            return "/edit";
        } else {
            Song song = new Song();
            BeanUtils.copyProperties(songDto,song);
            iSongService.edit(song);
            redirectAttributes.addFlashAttribute("mess","Update song success");
            return "redirect:/song";
        }
    }
}
