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
public class PrincipalController {

    @GetMapping("/")
    public String mostrarMenu(Model model) {
        List<String> opciones = List.of("Administrador", "Departamento", "Edificio", "Inquilino");
        model.addAttribute("opciones", opciones);
        return "index";
    }
    

    @PostMapping("/seleccionarOpcion")
    public String seleccionarOpcion(@RequestParam("mostrarMenu") String opcion) {
        switch (opcion) {
            case "Administrador":
                return "redirect:/administradores/findAll";
            case "Departamento":
                return "redirect:/departamentos/findAll";
            case "Edificio":
                return "redirect:/edificios/opciones";
            case "Inquilino":
                return "redirect:/inquilinos/findAll";
            default:
                return "redirect:/";
        }
    }
}