package com.conjunto.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.conjunto.dao.InquilinoDAO;
import com.conjunto.dao.VisitaDAO;
import com.conjunto.entities.Visita;

@Controller
@RequestMapping("/visitas")
public class VisitasController {
	@Autowired
	private VisitaDAO visitaDAO;
	@Autowired
	private InquilinoDAO inquilinoDAO;

	@GetMapping("/findAll")
	private String findAll(ModelMap modelMap) {

		List<Visita> visitas=visitaDAO.findAll();
		modelMap.addAttribute("visitas", visitas);
		return "visitas-listar";		

	}
			
	@GetMapping("/findOne")
	private String findOne(@RequestParam("idVisita") @Nullable Integer idVisita,
	                       @RequestParam("opcion") @Nullable Integer opcion,
	                       ModelMap modelMap) {
	    Visita visita = (idVisita != null) ? visitaDAO.findOne(idVisita) : new Visita();
	    modelMap.addAttribute("visita", visita);
	    modelMap.addAttribute("inquilino", inquilinoDAO.findAll());
	    
	    return (opcion != null && opcion == 1) ? "visitas-add" : "visitas-del";
	}


	

	@PostMapping("/add")
	private String add(@RequestParam("idVisita") @Nullable Integer idVisita,
	                   @RequestParam("nombreVisitante") @Nullable String nombreVisitante,
	                   @RequestParam("fechaVisita") @Nullable Date fechaVisita,
	                   @RequestParam("motivoVisita") @Nullable String motivoVisita,
	                   @RequestParam("observaciones") @Nullable String observaciones,
	                   @RequestParam("idInquilino") @Nullable Integer idInquilino) {

	    Visita visita;
	    
	    if (idVisita == null) {
	        visita = new Visita();
	    } else {
	        visita = visitaDAO.findOne(idVisita);
	        if (visita == null) {
	            return "redirect:/visitas/findAll";  // Si no existe, mejor redirigir.
	        }
	    }
	    
	    visita.setNombreVisitante(nombreVisitante);
	    visita.setFechaVisita(fechaVisita);
	    visita.setMotivoVisita(motivoVisita);
	    visita.setObservaciones(observaciones);
	    visita.setInquilino(inquilinoDAO.findOne(idInquilino));


	    visitaDAO.up(visita);
	    
	    return "redirect:/visitas/findAll";
	}

	@GetMapping("/del")
	private String del(@RequestParam("idVisita")@Nullable Integer idVisita) {
		visitaDAO.del(idVisita);
		return "redirect:/visitas/findAll";
	}
}
