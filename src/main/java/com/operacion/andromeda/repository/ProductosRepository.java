package com.operacion.andromeda.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.operacion.andromeda.model.ProductosModel;

@Repository
public interface ProductosRepository extends JpaRepository<ProductosModel, Integer> {
	List<ProductosModel> findByCategoriaContaining(String categoria);
}
