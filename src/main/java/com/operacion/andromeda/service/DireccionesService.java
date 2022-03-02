package com.operacion.andromeda.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.operacion.andromeda.model.DireccionesModel;
import com.operacion.andromeda.repository.DireccionesRepository;

@Service
public class DireccionesService {

	private final DireccionesRepository direccionesRepository;
	
	public DireccionesService(@Autowired DireccionesRepository direccionesRepository) {
		this.direccionesRepository = direccionesRepository;
	}

	public ArrayList<DireccionesModel> obtenerDatos() {
		return (ArrayList<DireccionesModel>) direccionesRepository.findAll();
	}

	public DireccionesModel guardarDatos(DireccionesModel direccionesModel) {
		return direccionesRepository.save(direccionesModel);
	}

	public boolean eliminarDato(Integer id) {
		try {
			direccionesRepository.deleteById(id);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}