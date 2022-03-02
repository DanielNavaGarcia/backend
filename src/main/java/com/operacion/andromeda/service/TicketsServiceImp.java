package com.operacion.andromeda.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.operacion.andromeda.model.TicketsModel;

import com.operacion.andromeda.repository.TicketsRepository;

@Service
public class TicketsServiceImp implements TicketsService {
	private final TicketsRepository ticketsRepository;
	
	public TicketsServiceImp(@Autowired TicketsRepository ticketsRepository) {
		this.ticketsRepository = ticketsRepository;
	}
	
    @Override
    public TicketsModel ObtenerTicket(Integer id) {
        Optional<TicketsModel> post = ticketsRepository.findById(id);
        return post.orElse(null);
    }
	
	@Override
	public List<TicketsModel> obtenerTodosTickets(){
		return (List<TicketsModel>) ticketsRepository.findAll();
	}
	
	@Override
	public TicketsModel guardarDatos(TicketsModel usuariosModel) {
		return ticketsRepository.save(usuariosModel);
	}
	
	@Override
	public boolean eliminarDato(Integer id) {
		try {
			ticketsRepository.deleteById(id);
			return true;
		} catch(Exception error) {
			return false;
		}
	}
}
