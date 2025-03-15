package com.conjunto.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.conjunto.dao.DepartamentoDAO;
import com.conjunto.dao.EdificioDAO;
import com.conjunto.entities.Departamento;



@Controller
@RequestMapping("/departamentos")
public class DepartamentoController {

	    @Autowired
	    private DepartamentoDAO departamentoDAO;
	    @Autowired
	    private EdificioDAO edificioDAO;

	    @GetMapping("/findByEdificio")
	    public String findByEdificio(@RequestParam("idEdificio") int idEdificio, Model model) {
	        List<Departamento> departamentos = departamentoDAO.findByEdificioId(idEdificio);
	        model.addAttribute("departamentos", departamentos);
	        return "departamentos-listar";
	}
}
