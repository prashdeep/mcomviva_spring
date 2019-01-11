package com.classpath.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@Controller
public class EmployeeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Model model) {
        model.addAttribute("message", "hello" );
        return "home";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginPage(Model model) {
        return "login";
    }


}