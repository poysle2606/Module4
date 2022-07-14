package codegym.controller;

import codegym.service.ISandWichService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandWichController {

    @Autowired
    ISandWichService iSandWichService;

    @GetMapping("/")
    public String listSandWich() {
        return "index";
    }

    @PostMapping("/save")
    public String result(@RequestParam("condiment") String[] condiment, Model model) {
        String mess = iSandWichService.sandWich(condiment);
        model.addAttribute("mess", mess);
        return "index";
    }

}
