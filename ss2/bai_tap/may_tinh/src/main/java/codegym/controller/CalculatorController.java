package codegym.controller;

import codegym.service.ICalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {

    @Autowired
    ICalculatorService iCalculatorService;

    @GetMapping
    public String display() {
        return "index";
    }

    @PostMapping("/calculator")
    public String calculator(@RequestParam double number1, double number2,@RequestParam("operand") String calculator, Model model) {
        String result = iCalculatorService.calculator(number1, number2, calculator);
        model.addAttribute("number1", number1);
        model.addAttribute("number2", number2);
        model.addAttribute("result", result);
        return "index";
    }
}
