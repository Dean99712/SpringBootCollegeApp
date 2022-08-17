package com.lecture.SpringBootCollegeApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = {"/api"},method = RequestMethod.GET)
public class DeveloperController {

   @GetMapping("/developer/info")
    public String displayUserController() {

        return "developerInfo.html";
    }
}
