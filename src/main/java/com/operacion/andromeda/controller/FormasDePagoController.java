package com.operacion.andromeda.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.operacion.andromeda.model.FormasDePagoModel;
import com.operacion.andromeda.service.FormasDePagoService;

@RestController 
public class FormasDePagoController {
	private final FormasDePagoService formasDePagoService;
	
	public FormasDePagoController(@Autowired FormasDePagoService formasDePagoService) {
		this.formasDePagoService = formasDePagoService;
	}

	@GetMapping("/formas-de-pago")
	public ArrayList<FormasDePagoModel> obtenerDatos() {
		return formasDePagoService.obtenerDatos();
	}

	@PostMapping("/formas-de-pago")
	public FormasDePagoModel guardarDatos(@RequestBody FormasDePagoModel formasDePagoModel) {
		return formasDePagoService.guardarDatos(formasDePagoModel);
	}
	
	@DeleteMapping (path = "/formas-de-pago/{id}")  
		public boolean eliminarDato(@PathVariable("id") Integer id) {
		return formasDePagoService.eliminarDato(id);
	}
}
