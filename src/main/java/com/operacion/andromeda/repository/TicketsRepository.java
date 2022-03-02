package com.operacion.andromeda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.operacion.andromeda.model.TicketsModel;

@Repository
public interface TicketsRepository  extends JpaRepository<TicketsModel, Integer>{

}
