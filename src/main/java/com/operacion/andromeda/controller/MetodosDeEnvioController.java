package com.operacion.andromeda.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.operacion.andromeda.model.MetodosDeEnvioModel;
import com.operacion.andromeda.service.MetodosDeEnvioService;

@RestController
public class MetodosDeEnvioController {
    private final MetodosDeEnvioService metodosDeEnvioService;
	
	public MetodosDeEnvioController(@Autowired MetodosDeEnvioService metodosDeEnvioService) {
		this.metodosDeEnvioService = metodosDeEnvioService;
	}
	
	@GetMapping("/metodos-de-envio")
	public ArrayList<MetodosDeEnvioModel> obtenerDato(){
		return metodosDeEnvioService.obtenerDatos();	
	}
	
	@PostMapping("/metodos-de-envio")
    public MetodosDeEnvioModel guardarDatos(@RequestBody MetodosDeEnvioModel metodosDeEnvioModel) {
    	return metodosDeEnvioService.guardarDatos(metodosDeEnvioModel);
    }

	@DeleteMapping(path = "metodos-de-envio/{id}")
	public boolean eliminarDato(@PathVariable("id") Integer id) {
		return metodosDeEnvioService.eliminarDato(id);
	}
}