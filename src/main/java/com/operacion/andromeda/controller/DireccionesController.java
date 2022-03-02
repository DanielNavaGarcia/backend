package com.operacion.andromeda.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.operacion.andromeda.model.DireccionesModel;
import com.operacion.andromeda.service.DireccionesService;

@RestController
public class DireccionesController {
	private final DireccionesService direccionesService;
	
	public DireccionesController(@Autowired DireccionesService direccionesService) {
		this.direccionesService = direccionesService;
	}
	
	@GetMapping("/direcciones")
	public ArrayList<DireccionesModel> ObtenerDato(){
		return direccionesService.obtenerDatos();
	}
	
	@PostMapping("/direcciones")
	public DireccionesModel guardarDatos(@RequestBody DireccionesModel direccionesModel) {
		return direccionesService.guardarDatos(direccionesModel);
	}
	
	@DeleteMapping(path = "direcciones/{id_direcciones}") 
	public boolean eliminarDato(@PathVariable("id_direcciones") Integer id_direcciones) {
		return direccionesService.eliminarDato(id_direcciones);
	}
}
