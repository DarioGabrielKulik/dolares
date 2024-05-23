package com.dolar.dolares.controllers;

import com.dolar.dolares.servicios.ServiceDolar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class PostControllers {

    @Autowired
    private ServiceDolar serviceDolar;

    @GetMapping("/dolares")
    public String dolares(ModelMap modelo){
        modelo.addAttribute("dolares", serviceDolar.dolar());
        return "index";
    }
}
