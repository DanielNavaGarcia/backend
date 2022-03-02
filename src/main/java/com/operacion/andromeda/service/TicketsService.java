package com.operacion.andromeda.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.operacion.andromeda.model.TicketsModel;

import com.operacion.andromeda.repository.TicketsRepository;

@Service
public class TicketsService {
	private final TicketsRepository ticketsRepository;
	
	public TicketsService(@Autowired TicketsRepository ticketsRepository) {
		this.ticketsRepository = ticketsRepository;
	}
	
	public ArrayList<TicketsModel> obtenerDatos(){
		return (ArrayList<TicketsModel>) ticketsRepository.findAll();
	}
	
	public TicketsModel guardarDatos(TicketsModel usuariosModel) {
		return ticketsRepository.save(usuariosModel);
	}
	
	public boolean eliminarDato(Integer id) {
		try {
			ticketsRepository.deleteById(id);
			return true;
		} catch(Exception error) {
			return false;
		}
	}

}
