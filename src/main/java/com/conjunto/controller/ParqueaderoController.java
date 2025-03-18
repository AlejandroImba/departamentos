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
	private String findOne(@RequestParam("IdParqueadero")@Nullable Integer idParqueadero
			,@RequestParam("opcion")@Nullable Integer opcion
			,ModelMap modelMap
			) {
		if(idParqueadero != null) {
			Parqueadero parqueadero = parqueaderoDAO.findOne(idParqueadero);
			modelMap.addAttribute("parqueadero", parqueadero);
			
		}
		modelMap.addAttribute("edificios", edificioDAO.findAll());
		modelMap.addAttribute("administradores", administradorDAO.findAll());
		if(opcion==1) return "parqueaderos-add";
		return "parqueaderos-del";
	}

	

	@PostMapping("/add")
	private String add(@RequestParam("idParqueadero")@Nullable Integer idParqueadero
				,@RequestParam("ubicacion")@Nullable String ubicacion
				,@RequestParam("disponibilidad")@Nullable String disponibilidad
				,@RequestParam("idAdministrador")@Nullable Integer idAdministrador	
				,@RequestParam("idEdificio")@Nullable Integer idEdificio	
			) {
		
		if(idParqueadero == null) {
			Parqueadero parqueadero = new Parqueadero(0,ubicacion,disponibilidad,administradorDAO.findOne(idAdministrador),
					edificioDAO.findOne(idEdificio));
			parqueaderoDAO.add(parqueadero);
			
		}else {
			Parqueadero parqueadero = new Parqueadero(idParqueadero,ubicacion,disponibilidad,administradorDAO.findOne(idAdministrador),
					edificioDAO.findOne(idEdificio));
			parqueaderoDAO.up(parqueadero);
		}
		
		
		return "redirect:/parqueaderos/findAll";
	}
	
	@GetMapping("/del")
	private String del(@RequestParam("idParqueadero")@Nullable Integer idParqueadero) {
		parqueaderoDAO.del(idParqueadero);
		return "redirect:/parqueaderos/findAll";
	}
}
