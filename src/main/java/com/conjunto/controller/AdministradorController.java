package com.conjunto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.conjunto.dao.AdministradorDAO;
import com.conjunto.entities.Administrador;

@Controller
@RequestMapping("/administradores")
public class AdministradorController {
	@Autowired
	private AdministradorDAO administradorDAO;
	

	@GetMapping("/findAll")
	public String findAll(Model model) {
		
		List<Administrador> administradores = administradorDAO.findAll();
		
		model.addAttribute("administradores", administradores);		
		
		return "administradores-listar";
	}
	
	@GetMapping("/findOne")
	public String findOne(@RequestParam("idAdministrador") @Nullable Integer idAdministrador
			, @RequestParam("opcion") @Nullable Integer opcion
			, Model model
			) {
		if(idAdministrador != null) {
			Administrador administrador = administradorDAO.findOne(idAdministrador);
			model.addAttribute("administrador", administrador);
		}
		
		
		if(opcion == 1) return "administradores-add";
		else return "administradores-del";
	}
	
	@PostMapping("/add")
	public String add(@RequestParam("idAdministrador") @Nullable Integer idAdministrador
			, @RequestParam("nombre") @Nullable String nombre
			, @RequestParam("apellido") @Nullable String apellido
			, @RequestParam("telefono") @Nullable String telefono
			, @RequestParam("correo") @Nullable String correo
			, @RequestParam("codigo") @Nullable int codigo
			) {
		
		if(idAdministrador == null) {
			Administrador administrador = new Administrador(0,nombre, apellido, telefono, correo,codigo);
			administradorDAO.add(administrador);
		}else {
			Administrador administrador2 = new Administrador(idAdministrador,nombre, apellido, telefono, correo,codigo);
			administradorDAO.up(administrador2);
		}
		
		return "redirect:/administradores/findAll";
	}
	



	@GetMapping("/del")
	@ResponseBody
	public String del(@RequestParam("idAdministrador") @Nullable Integer idAdministrador) {
	    try {
	        administradorDAO.del(idAdministrador);
	        return "success";
	    } catch (DataIntegrityViolationException e) {
	        return "errorMessage";
	    }
	}
	
}
