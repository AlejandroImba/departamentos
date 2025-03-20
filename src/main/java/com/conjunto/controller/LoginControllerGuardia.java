package com.conjunto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class LoginControllerGuardia {

    @GetMapping("/loginguardia")
    public String mostrarFormularioLogin() {
        return "loginguardia"; // Busca en WEB-INF/views/login.jsp
    }

    @PostMapping("/loginguardia")
    public String procesarLogin(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            Model model) {

        if ("123".equals(username) && "123".equals(password)) {
            return "redirect:/guardia"; // Cambia esto a la vista de tu página principal
        } else {
            model.addAttribute("error", "Usuario o contraseña incorrectos");
            return "loginguardia";
        }
    }
}

