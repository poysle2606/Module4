package c0322g1.controller;

import c0322g1.service.ICurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.xml.ws.Service;


@Controller
public class ConvertCurrency {

    @Autowired
    ICurrencyService iCurrencyService;

    @GetMapping
    public String list() {
        return "change_money";
    }

    @PostMapping
    public String result(@RequestParam double usd, Model model) {
        double result = iCurrencyService.changeMoney(usd);
        model.addAttribute("result", result);

        return "change_money";
    }
}
