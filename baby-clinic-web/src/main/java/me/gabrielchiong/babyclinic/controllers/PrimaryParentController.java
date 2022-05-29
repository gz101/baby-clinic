package me.gabrielchiong.babyclinic.controllers;

import me.gabrielchiong.babyclinic.services.PrimaryParentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/primaryparents")
@Controller
public class PrimaryParentController {
    private final PrimaryParentService primaryParentService;

    public PrimaryParentController(PrimaryParentService primaryParentService) {
        this.primaryParentService = primaryParentService;
    }

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listPrimaryParents(Model model) {
        model.addAttribute("primaryParents", primaryParentService.findAll());
        return "primaryparents/index";
    }
}
