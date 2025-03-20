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
import com.conjunto.dao.EdificioDAO;
import com.conjunto.dao.InquilinoDAO;
import com.conjunto.dao.ParqueaderoDAO;
import com.conjunto.entities.Inquilino;
import com.conjunto.entities.Parqueadero;
@Controller
@RequestMapping("/parqueaderos")
public class ParqueaderoController {
	@Autowired
	private EdificioDAO edificioDAO;
	@Autowired
	private AdministradorDAO administradorDAO;
	@Autowired
	private ParqueaderoDAO parqueaderoDAO;
	
	@GetMapping("/findAll")
	private String findAll(ModelMap modelMap) {

		List<Parqueadero> parqueaderos=parqueaderoDAO.findAll();
		modelMap.addAttribute("parqueaderos", parqueaderos);
		return "parqueaderos-listar";		

	}
			
	@GetMapping("/findOne")
	private String findOne(@RequestParam("idParqueadero") @Nullable Integer idParqueadero,
	                       @RequestParam("opcion") @Nullable Integer opcion,
	                       ModelMap modelMap) {
	    Parqueadero parqueadero = (idParqueadero != null) ? parqueaderoDAO.findOne(idParqueadero) : new Parqueadero();
	    modelMap.addAttribute("parqueadero", parqueadero);
	    modelMap.addAttribute("edificios", edificioDAO.findAll());
	    modelMap.addAttribute("administradores", administradorDAO.findAll());
	    
	    return (opcion != null && opcion == 1) ? "parqueaderos-add" : "parqueaderos-del";
	}


	

	@PostMapping("/add")
	private String add(@RequestParam("idParqueadero") @Nullable Integer idParqueadero,
	                   @RequestParam("ubicacion") @Nullable String ubicacion,
	                   @RequestParam("disponibilidad") @Nullable String disponibilidad,
	                   @RequestParam("idAdministrador") @Nullable Integer idAdministrador,
	                   @RequestParam("idEdificio") @Nullable Integer idEdificio) {

	    Parqueadero parqueadero;
	    
	    if (idParqueadero == null) {
	        parqueadero = new Parqueadero();
	    } else {
	        parqueadero = parqueaderoDAO.findOne(idParqueadero);
	        if (parqueadero == null) {
	            return "redirect:/parqueaderos/findAll";  // Si no existe, mejor redirigir.
	        }
	    }
	    
	    parqueadero.setUbicacion(ubicacion);
	    parqueadero.setDisponibilidad(disponibilidad);
	    parqueadero.setAdministrador(administradorDAO.findOne(idAdministrador));
	    parqueadero.setEdificio(edificioDAO.findOne(idEdificio));

	    parqueaderoDAO.up(parqueadero);
	    
	    return "redirect:/parqueaderos/findAll";
	}

	@GetMapping("/del")
	private String del(@RequestParam("idParqueadero")@Nullable Integer idParqueadero) {
		parqueaderoDAO.del(idParqueadero);
		return "redirect:/parqueaderos/findAll";
	}
}
