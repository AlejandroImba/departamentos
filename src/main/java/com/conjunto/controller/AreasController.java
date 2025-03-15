package com.conjunto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/areas")
public class AreasController {
    @GetMapping("/areassociales")
    public String mostrarAreas() {
        return "areas-sociales";
    }
}
