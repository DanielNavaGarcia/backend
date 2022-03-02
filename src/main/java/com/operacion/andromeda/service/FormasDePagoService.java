package com.operacion.andromeda.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.operacion.andromeda.model.FormasDePagoModel;
import com.operacion.andromeda.repository.FormasDePagoRepository;

@Service
public class FormasDePagoService {
	private final FormasDePagoRepository formasDePagoRepository;
	
	public FormasDePagoService (@Autowired FormasDePagoRepository formasDePagoRepository) {
		this.formasDePagoRepository = formasDePagoRepository;
	}
	
	public ArrayList<FormasDePagoModel> obtenerDatos(){
		return (ArrayList<FormasDePagoModel>) formasDePagoRepository.findAll();
	}
	
	public FormasDePagoModel guardarDatos(FormasDePagoModel formasDePagoModel) {
		return formasDePagoRepository.save(formasDePagoModel);
	}
	
	public boolean eliminarDato(Integer id) {
		try {
			formasDePagoRepository.deleteById(id);
			return true;
		} catch(Exception error) {
			return false;
		}
	}	
}
