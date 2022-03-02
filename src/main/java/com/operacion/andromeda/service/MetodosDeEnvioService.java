package com.operacion.andromeda.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.operacion.andromeda.model.MetodosDeEnvioModel;
import com.operacion.andromeda.repository.MetodosDeEnvioRepository;

@Service
public class MetodosDeEnvioService {
	private final MetodosDeEnvioRepository metodosDeEnvioRepository;
	
	public MetodosDeEnvioService (@Autowired MetodosDeEnvioRepository metodosDeEnvioRepository) {
		this.metodosDeEnvioRepository = metodosDeEnvioRepository; 
	}
	
	public ArrayList<MetodosDeEnvioModel>obtenerDatos(){
		return (ArrayList<MetodosDeEnvioModel>) metodosDeEnvioRepository.findAll();
	}
	
	public MetodosDeEnvioModel guardarDatos(MetodosDeEnvioModel metodosDeEnvioModel) {
		return metodosDeEnvioRepository.save(metodosDeEnvioModel);
	}
	
	public boolean eliminarDato(Integer id) {
		try {
			metodosDeEnvioRepository.deleteById(id);
			return true;
		} catch(Exception error) {
			return false;
		}
	}
	

}
