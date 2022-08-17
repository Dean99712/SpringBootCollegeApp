package com.lecture.SpringBootCollegeApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {


    @GetMapping("/home")
    public String displayHomePage(Model model) {

        model.addAttribute("username","Dean");

        return "home.html";
    }
}
