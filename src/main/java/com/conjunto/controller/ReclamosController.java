package com.conjunto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.conjunto.dao.InquilinoDAO;
import com.conjunto.dao.ReclamoDAO;
import com.conjunto.entities.Inquilino;
import com.conjunto.entities.Reclamo;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/reclamos")
public class ReclamosController {
	  @GetMapping("/formreclamos")
	    public String mostrarReclamos(Model model) {
	        // Obtener la lista de inquilinos desde la base de datos
	        List<Inquilino> inquilinos = inquilinoDAO.findAll();
	        // Pasar la lista al modelo
	        model.addAttribute("inquilinos", inquilinos);
	        return "formulario-reclamos"; // Retorna la vista JSP
	    }
	        @Autowired
	        private ReclamoDAO reclamoDAO;
	       @Autowired
	        private InquilinoDAO inquilinoDAO;
	        @PostMapping("/insertar")
	        public String insertarReclamo(@RequestParam("fecha_reclamo") @DateTimeFormat(pattern = "yyyy-MM-dd") Date fechaReclamo,
	                                      @RequestParam("descripcion") String descripcion,
	                                      @RequestParam("id_inquilino") int idInquilino) {
	            // Crear un nuevo objeto Reclamo
	            Reclamo reclamo = new Reclamo();
	            reclamo.setFechaReclamo(fechaReclamo);
	            reclamo.setDescripcion(descripcion);

	        // Crear un objeto Inquilino y asignarle el ID
	            Inquilino inquilino = new Inquilino();
	            inquilino.setIdInquilino(idInquilino);
	            reclamo.setInquilino(inquilino);

	            // Guardar el reclamo en la base de datos
	            reclamoDAO.add(reclamo);

	            // Redirigir a una página de confirmación o a la lista de reclamos
	            return "redirect:/"; // Cambia esto según tu flujo de trabajo
	        }
}
	    	
	

