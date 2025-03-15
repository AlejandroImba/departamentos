package com.conjunto.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.conjunto.dao.AdministradorDAO;
import com.conjunto.dao.EdificioDAO;
import com.conjunto.dao.InquilinoDAO;
import com.conjunto.dao.ParqueaderoDAO;
import com.conjunto.entities.Administrador;
import com.conjunto.entities.Inquilino;
@Controller
@RequestMapping("/inquilinos")
public class InquilinoController {
	@Autowired
	private InquilinoDAO inquilinoDAO;
	
	@Autowired
	private EdificioDAO edificioDAO;
	@Autowired
	private AdministradorDAO administradorDAO;
	@Autowired
	private ParqueaderoDAO parqueaderoDAO;
	
	
	@GetMapping("/findAll")
	private String findAll(ModelMap modelMap) {

		List<Inquilino> inquilinos=inquilinoDAO.findAll();
		modelMap.addAttribute("inquilinos", inquilinos);
		return "inquilinos-listar";		

	}
			
	@GetMapping("/findOne")
	private String findOne(@RequestParam("idInquilino")@Nullable Integer idInquilino
			,@RequestParam("opcion")@Nullable Integer opcion
			,ModelMap modelMap
			) {
		if(idInquilino != null) {
			Inquilino inquilino = inquilinoDAO.findOne(idInquilino);
			modelMap.addAttribute("inquilino", inquilino);
			
		}
		modelMap.addAttribute("edificios", edificioDAO.findAll());
		modelMap.addAttribute("administradores", administradorDAO.findAll());
		modelMap.addAttribute("parqueaderos", parqueaderoDAO.findAll());
		if(opcion==1) return "inquilinos-add";
		return "inquilinos-del";
	}
	

	@PostMapping("/add")
	private String add(
	    @RequestParam("idInquilino") @Nullable Integer idInquilino,
	    @RequestParam("nombre") @Nullable String nombre,
	    @RequestParam("apellido") @Nullable String apellido,
	    @RequestParam("telefono") @Nullable String telefono,
	    @RequestParam("telefonoReferencia") @Nullable String telefonoReferencia,
	    @RequestParam("correo") @Nullable String correo,
	    @RequestParam("idEdificio") @Nullable Integer idEdificio,
	    @RequestParam("idAdministrador") @Nullable Integer idAdministrador,
	    @RequestParam(value = "idParqueadero", required = false) String idParqueadero // Cambio aquí
	) {
	    // Convertir idParqueadero a Integer solo si no está vacío
	    Integer idParqueaderoValue = null;
	    if (idParqueadero != null && !idParqueadero.isEmpty()) {
	        try {
	            idParqueaderoValue = Integer.parseInt(idParqueadero);
	        } catch (NumberFormatException e) {
	            // Manejar el caso en el que el valor no sea un número válido
	            // Por ejemplo, puedes lanzar una excepción o asignar null
	            idParqueaderoValue = null;
	        }
	    }

	    // Crear o actualizar el inquilino
	    if (idInquilino == null) {
	        Inquilino inquilino = new Inquilino(
	            0,
	            nombre,
	            apellido,
	            telefono,
	            telefonoReferencia,
	            correo,
	            administradorDAO.findOne(idAdministrador),
	            edificioDAO.findOne(idEdificio),
	            idParqueaderoValue != null ? parqueaderoDAO.findOne(idParqueaderoValue) : null // Manejar null
	        );
	        inquilinoDAO.add(inquilino);
	    } else {
	        Inquilino inquilino = new Inquilino(
	            idInquilino,
	            nombre,
	            apellido,
	            telefono,
	            telefonoReferencia,
	            correo,
	            administradorDAO.findOne(idAdministrador),
	            edificioDAO.findOne(idEdificio),
	            idParqueaderoValue != null ? parqueaderoDAO.findOne(idParqueaderoValue) : null // Manejar null
	        );
	        inquilinoDAO.up(inquilino);
	    }

	    return "redirect:/inquilinos/findAll";
	}
	
	@GetMapping("/del")
	private String del(@RequestParam("idInquilino")@Nullable Integer idInquilino) {
		inquilinoDAO.del(idInquilino);
		return "redirect:/inquilinos/findAll";
	}
}
