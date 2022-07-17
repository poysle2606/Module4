package codegym.controller;

import codegym.service.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/dictionary")
public class DictionaryController {
    @Autowired
    IDictionaryService iDictionaryService;

    @GetMapping("")
    public String dictionary(){
        return "display";
    }

    @PostMapping("")
    public String result(@RequestParam String search, Model model){
        String result = iDictionaryService.language(search);
        model.addAttribute("result",result);
        return "display";
    }
}
