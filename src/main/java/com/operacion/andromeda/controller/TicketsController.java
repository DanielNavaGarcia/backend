package com.operacion.andromeda.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.operacion.andromeda.model.TicketsModel;
import com.operacion.andromeda.service.TicketsService;

@RestController
public class TicketsController {
    private final TicketsService ticketsService;
	
	public TicketsController(@Autowired TicketsService ticketsService) {
		this.ticketsService = ticketsService;
	}

	@GetMapping("/tickets")
	public ArrayList<TicketsModel> obtenerDato(){
		return ticketsService.obtenerDatos();	
	}

	@PostMapping("/tickets")
    public TicketsModel guardarDatos(@RequestBody TicketsModel ticketsModel) {
    	return ticketsService.guardarDatos(ticketsModel);
    }
	
	@DeleteMapping(path = "tickets/{id}")
	public boolean eliminarDato(@PathVariable("id") Integer id) {
		return ticketsService.eliminarDato(id);
	}
}
