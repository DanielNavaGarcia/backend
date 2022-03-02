package com.operacion.andromeda.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.operacion.andromeda.model.UsuariosModel;
import com.operacion.andromeda.service.UsuariosService;

@RestController
public class UsuariosController {
    private final UsuariosService usuariosService;
	
	public UsuariosController(@Autowired UsuariosService usuariosService) {
		this.usuariosService = usuariosService;
	}
	
	@GetMapping("/usuarios")
	public ArrayList<UsuariosModel> obtenerDato(){
		return usuariosService.obtenerDatos();	
	}

	@PostMapping("/usuarios")
    public UsuariosModel guardarDatos(@RequestBody UsuariosModel usuariosModel) {
    	return usuariosService.guardarDatos(usuariosModel);
    }
	
	@DeleteMapping(path = "usuarios/{id}")
	public boolean eliminarDato(@PathVariable("id") Integer id) {
		return usuariosService.eliminarDato(id);
	}
}