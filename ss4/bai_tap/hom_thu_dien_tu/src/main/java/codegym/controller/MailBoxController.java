package codegym.controller;

import codegym.model.MailBox;
import codegym.service.ILanguageService;
import codegym.service.IMailBoxService;
import codegym.service.IPageSizeService;
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
public class MailBoxController {
    @Autowired
    IMailBoxService iMailBoxService;
    @Autowired
    ILanguageService iLanguageService;
    @Autowired
    IPageSizeService iPageSizeService;

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("list", iMailBoxService.allList());
        return "list";
    }

    @GetMapping("/edit")
    public ModelAndView showEditForm(@RequestParam int id) {
        ModelAndView modelAndView = new ModelAndView("edit");
        modelAndView.addObject("email", iMailBoxService.findById(id));
        modelAndView.addObject("languageList", iLanguageService.listLanguage());
        modelAndView.addObject("pageSizeList", iPageSizeService.pageList());
        return modelAndView;
    }

    @PostMapping("/edit")
    public String editMail(@ModelAttribute MailBox mailBox, int id, RedirectAttributes redirectAttributes){
        iMailBoxService.edit(mailBox,id);
        redirectAttributes.addFlashAttribute("mess","Edit MailBox: Success");
        return "redirect:list";
    }
}
