package com.pacoillan;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EntidadController {
	
	@Autowired
	EntidadRepository repositorio;

	@RequestMapping("/listaEntidades")
	public String listaEntidades(Model modelo) {
		
		List<Entidad> lista = repositorio.buscarTodas();
		modelo.addAttribute("listaEntidades",lista);
		return "listaEntidades";
	}
	
	@RequestMapping("/formularioNuevaEntidad")
	public String formularioNuevaEntidad(Model modelo) {
		
		modelo.addAttribute("entidad",new Entidad());
		return "formularioNuevaEntidad";
	}
	@RequestMapping("/formularioInsertarEntidad")
	public String formularioInsertarEntidad(Model modelo,@ModelAttribute Entidad entidad) {
		
		repositorio.insertar(entidad);
		List<Entidad> lista = repositorio.buscarTodas();
		modelo.addAttribute("listaEntidades",lista);
		return "listaEntidades";
		
		
	}
}
