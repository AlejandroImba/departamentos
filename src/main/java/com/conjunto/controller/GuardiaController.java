package com.conjunto.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class GuardiaController {

  
    @GetMapping("/guardia")
    public String mostrarFormularioLogin() {
        return "vistaguardia"; // Busca en WEB-INF/views/login.jsp
    }
}
