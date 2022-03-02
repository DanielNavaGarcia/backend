package com.operacion.andromeda.repository;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.operacion.andromeda.model.UsuariosModel;

@Repository
public interface UsuariosRepository extends CrudRepository<UsuariosModel, Integer> {

}
