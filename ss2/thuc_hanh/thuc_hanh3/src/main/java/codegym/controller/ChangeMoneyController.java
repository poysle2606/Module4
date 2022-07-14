package codegym.controller;

import codegym.service.IChangMoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ChangeMoneyController {

    @Autowired
    IChangMoneyService service;

    @GetMapping("/money")
    public String listMoney() {
        return "index";
    }

    @PostMapping("/money")
    public String changeMoney(@RequestParam double usd, Model model){
        double result = service.moneyToChang(usd);
        model.addAttribute("usd", usd);
        model.addAttribute("result", result);
        return "index";
    }
}
