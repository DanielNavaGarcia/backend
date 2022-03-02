package com.operacion.andromeda.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.operacion.andromeda.model.UsuariosModel;
import com.operacion.andromeda.repository.UsuariosRepository;

@Service
public class UsuariosServiceImp implements UsuariosService {
	private final UsuariosRepository usuariosRepository;
	
	public UsuariosServiceImp(@Autowired UsuariosRepository usuariosRepository) {
		this.usuariosRepository = usuariosRepository;
	}
	@Override
	public List<UsuariosModel> obtenerTodosUsuarios(){
		return (List<UsuariosModel>) usuariosRepository.findAll();
	}
	@Override
	public UsuariosModel guardarDatos(UsuariosModel usuariosModel) {
		return usuariosRepository.save(usuariosModel);
	}
	@Override
	public boolean eliminarDato(Integer id) {
		try {
			usuariosRepository.deleteById(id);
			return true;
		} catch(Exception error) {
			return false;
		}
	}
}