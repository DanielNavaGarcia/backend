package com.operacion.andromeda.service;

import com.operacion.andromeda.model.UsuariosModel;
import java.util.List;

public interface UsuariosService {
	List<UsuariosModel> obtenerTodosUsuarios();
	UsuariosModel guardarDatos(UsuariosModel usuariosModel);
	boolean eliminarDato(Integer id);
}