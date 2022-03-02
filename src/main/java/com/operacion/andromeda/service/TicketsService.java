package com.operacion.andromeda.service;

import java.util.List;

import com.operacion.andromeda.model.TicketsModel;

public interface TicketsService {
	TicketsModel ObtenerTicket(Integer id);
	List<TicketsModel> obtenerTodosTickets();
	TicketsModel guardarDatos(TicketsModel usuariosModel);
	boolean eliminarDato(Integer id);

}
