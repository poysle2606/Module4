package codegym.controller;

import codegym.model.Medical;
import codegym.servcie.IMedicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormYteController {

    @Autowired
    IMedicalService iMedicalService;

    @GetMapping("/form")
    public ModelAndView formYte(){
        ModelAndView modelAndView = new ModelAndView("display","medical",new Medical());
        modelAndView.addObject("yearOfBirth",iMedicalService.getYearOfBirth());
        modelAndView.addObject("gender",iMedicalService.getGender());
        modelAndView.addObject("national",iMedicalService.getNational());
        modelAndView.addObject("move",iMedicalService.getMove());
        modelAndView.addObject("dayStart",iMedicalService.getDayStart());
        modelAndView.addObject("monthStart",iMedicalService.getMonthStart());
        modelAndView.addObject("yearStart",iMedicalService.getYearStart());
        modelAndView.addObject("dayEnd",iMedicalService.getDayEnd());
        modelAndView.addObject("monthEnd",iMedicalService.getMonthEnd());
        modelAndView.addObject("yearEnd",iMedicalService.getYearEnd());
        return modelAndView ;
    }

    @PostMapping("/result")
    public ModelAndView save(@ModelAttribute("medical")Medical medical){
        ModelAndView modelAndView = new ModelAndView("result");
        return modelAndView;
    }
}
