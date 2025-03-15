	package com.conjunto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.conjunto.dao.AdministradorDAO;
import com.conjunto.dao.DepartamentoDAO;
import com.conjunto.dao.EdificioDAO;
import com.conjunto.entities.Administrador;
import com.conjunto.entities.Departamento;
import com.conjunto.entities.Edificio;

@Controller
@RequestMapping("/edificios")
public class EdificioController {
	
	   @Autowired
	    private EdificioDAO edificioDAO;

	    @Autowired
	    private AdministradorDAO administradorDAO;
	  /*  @Autowired
	    private DepartamentoDAO departamentoDAO;*/

	    @GetMapping("/findAll")
	    public String findAll(ModelMap modelMap) {
	        List<Edificio> edificios = edificioDAO.findAll();
	        modelMap.addAttribute("edificios", edificios);
	        return "edificios-listar";
	    }

	    @GetMapping("/findOne")
	    public String findOne(@RequestParam("idEdificio") @Nullable Integer idEdificio,
	                          @RequestParam("opcion") @Nullable Integer opcion,
	                          ModelMap modelMap) {
	        if (idEdificio != null) {
	            Edificio edificio = edificioDAO.findOne(idEdificio);
	            modelMap.addAttribute("edificio", edificio);
	        }
	        modelMap.addAttribute("administradores", administradorDAO.findAll());
	        return (opcion == 1) ? "edificios-add" : "edificios-del";
	    }

	    @PostMapping("/add")
	    public String add(@RequestParam("idEdificio") @Nullable Integer idEdificio,
	                      @RequestParam("color") @Nullable String color,
	                      @RequestParam("numDep") @Nullable Integer numDep,
	                      @RequestParam("pisos") @Nullable Integer pisos,
	                      @RequestParam("idAdmin") @Nullable Integer idAdmin) {
	        
	        Administrador administrador = administradorDAO.findOne(idAdmin);
	        
	        Edificio edificio = new Edificio(
	            (idEdificio == null) ? 0 : idEdificio,
	            color,
	            numDep,
	            pisos,
	            administrador
	        );

	        if (idEdificio == null) {
	            edificioDAO.add(edificio);
	        } else {
	            edificioDAO.up(edificio);
	        }
	        
	        return "redirect:/edificios/findAll";
	    }
	 
	

	    @GetMapping("/del")
	    public String del(@RequestParam("idEdificio") @Nullable Integer idEdificio) {
	        if (idEdificio != null) {
	            edificioDAO.del(idEdificio);
	        }
	        return "redirect:/edificios/findAll";
	    }



}
