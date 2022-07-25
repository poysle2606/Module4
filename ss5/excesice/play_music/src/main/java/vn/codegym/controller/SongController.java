package vn.codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.codegym.model.Song;
import vn.codegym.service.ISongService;

@Controller
@RequestMapping("/song")
public class SongController {
    @Autowired
    ISongService iSongService;

    @GetMapping("")
    public String list(Model model) {
        model.addAttribute("song", iSongService.findAll());
        return "/list";
    }

    @GetMapping("/create")
    public String createForm(Model model) {
        model.addAttribute("song", new Song());
        return "/create";
    }

    @PostMapping("/save")
    public String createSong(@ModelAttribute("song") Song song, RedirectAttributes redirectAttributes) {
        iSongService.create(song);
        redirectAttributes.addFlashAttribute("mess", "Create Song success");
        return "redirect:/song";
    }

    @GetMapping("/edit/{id}")
    public String editForm(@PathVariable Integer id, Model model) {
        Song song = iSongService.findById(id);
        model.addAttribute("song", song);
        return "/edit";
    }

    @PostMapping("/update")
    public String editSong(Song song, RedirectAttributes redirectAttributes) {
        iSongService.update(song.getId(), song);
        redirectAttributes.addFlashAttribute("mess", "Update song success");
        return "redirect:/song";
    }

    @PostMapping("/delete")
    public String deleteSong(@RequestParam Integer id, RedirectAttributes redirectAttributes) {
        iSongService.delete(id);
        redirectAttributes.addFlashAttribute("mess", "Delete success");
        return "redirect:/song";
    }
}
