package me.gabrielchiong.babyclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/primaryparents")
@Controller
public class PrimaryParentController {
    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listPrimaryParents() {
        return "primaryparents/index";
    }
}
