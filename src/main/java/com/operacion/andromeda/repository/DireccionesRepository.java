package com.operacion.andromeda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.operacion.andromeda.model.DireccionesModel;

@Repository
public interface DireccionesRepository extends JpaRepository<DireccionesModel, Integer>
{

}
