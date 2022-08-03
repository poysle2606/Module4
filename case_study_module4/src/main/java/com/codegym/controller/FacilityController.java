package com.codegym.controller;

import com.codegym.model.facility.Facility;
import com.codegym.model.facility.FacilityType;
import com.codegym.service.facility.IFacilityService;
import com.codegym.service.facility.IFacilityTypeService;
import com.codegym.service.facility.IRentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/facility")
public class FacilityController {

    @Autowired
    IFacilityService iFacilityService;

    @Autowired
    IFacilityTypeService iFacilityTypeService;

    @Autowired
    IRentTypeService iRentTypeService;

    @GetMapping("")
    public String listFacility(@PageableDefault(value = 5) Pageable pageable, Model model){
        model.addAttribute("facilityType",iFacilityTypeService.findAll());
        model.addAttribute("rentType",iRentTypeService.findAll());
        model.addAttribute("facility",iFacilityService.findAll(pageable));
        return "/facility/list";
    }

    @GetMapping("/create")
    public String createFormFacility( Model model){
        model.addAttribute("rentType",iRentTypeService.findAll());
        model.addAttribute("facilityType",iFacilityTypeService.findAll());
        model.addAttribute("facility",new Facility());
        return "/facility/create";
    }

    @PostMapping("/save")
    public String saveFacility(@ModelAttribute ("facility") Facility facility,Model model, RedirectAttributes redirectAttributes){
        model.addAttribute("facilityType",iFacilityTypeService.findAll());
        model.addAttribute("rentType",iRentTypeService.findAll());
        iFacilityService.create(facility);
        redirectAttributes.addFlashAttribute("mess","Thêm dịch vụ thành công");
        return "redirect:/facility";
    }
}
