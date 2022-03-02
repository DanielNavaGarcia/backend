package com.operacion.andromeda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.operacion.andromeda.model.FormasDePagoModel;


@Repository
public interface FormasDePagoRepository extends JpaRepository <FormasDePagoModel, Integer>{

}