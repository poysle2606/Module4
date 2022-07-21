package codegym.controller;

import codegym.model.Medical;
import codegym.service.IMedicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MedicalController {
    @Autowired
    IMedicalService iMedicalService;

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("medical", iMedicalService.findAll());
        return "/list";
    }

    @GetMapping("/create")
    public ModelAndView createForm() {
        ModelAndView modelAndView = new ModelAndView("create", "medical", new Medical());
        modelAndView.addObject("yearOfBirth",iMedicalService.getYearOfBirth());
        modelAndView.addObject("move",iMedicalService.getMove());
        modelAndView.addObject("dayStart",iMedicalService.getDayStart());
        modelAndView.addObject("monthStart",iMedicalService.getMonthStart());
        modelAndView.addObject("yearStart",iMedicalService.getYearStart());
        modelAndView.addObject("dayEnd",iMedicalService.getDayEnd());
        modelAndView.addObject("monthEnd",iMedicalService.getMonthEnd());
        modelAndView.addObject("yearEnd",iMedicalService.getYearEnd());

        return modelAndView;
    }

    @PostMapping("/list")
    public String save(Medical medical, RedirectAttributes redirectAttributes) {
        iMedicalService.create(medical);
        redirectAttributes.addFlashAttribute("mess","Create Success");
        return "redirect:/list";
    }

    @GetMapping("/edit")
    public ModelAndView editFormMedical(@RequestParam("id") int id){
        ModelAndView modelAndView = new ModelAndView("edit");
        modelAndView.addObject("edit",iMedicalService.findId(id));
        modelAndView.addObject("yearOfBirth",iMedicalService.getYearOfBirth());
        modelAndView.addObject("move",iMedicalService.getMove());
        modelAndView.addObject("dayStart",iMedicalService.getDayStart());
        modelAndView.addObject("monthStart",iMedicalService.getMonthStart());
        modelAndView.addObject("yearStart",iMedicalService.getYearStart());
        modelAndView.addObject("dayEnd",iMedicalService.getDayEnd());
        modelAndView.addObject("monthEnd",iMedicalService.getMonthEnd());
        modelAndView.addObject("yearEnd",iMedicalService.getYearEnd());

        return modelAndView;
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute Medical medical,int id, RedirectAttributes redirectAttributes){
        iMedicalService.edit(medical,id);
        redirectAttributes.addFlashAttribute("mess","Edit Success");
        return "redirect:list";
    }
}
