package com.operacion.andromeda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.operacion.andromeda.model.MetodosDeEnvioModel;

@Repository
public interface MetodosDeEnvioRepository extends JpaRepository <MetodosDeEnvioModel, Integer> {

}
