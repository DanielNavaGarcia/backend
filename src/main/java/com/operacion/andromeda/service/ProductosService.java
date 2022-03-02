package com.operacion.andromeda.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.operacion.andromeda.model.ProductosModel;
import com.operacion.andromeda.repository.ProductosRepository;

@Service
public class ProductosService {
	private final ProductosRepository productosRepository;
	
	public ProductosService(@Autowired ProductosRepository productosRepository) {
		this.productosRepository = productosRepository;
	}
	
	public ArrayList<ProductosModel> obtenerDatos(){
		return (ArrayList<ProductosModel>) productosRepository.findAll();
	}
	
	public ProductosModel guardarDatos(ProductosModel productosModel) {
		return productosRepository.save(productosModel);
	}
	
	public boolean eliminarDato(Integer id) {
		try {
			productosRepository.deleteById(id);
			return true;
		} catch(Exception error) {
			return false;
		}
	}	
	
	public Optional<ProductosModel> encontrarDato(Integer id) {
		try {
			return productosRepository.findById(id);
		}catch (Exception error) {
			return Optional.empty();
		}
	}
	

	public ArrayList<ProductosModel> encontrarCategoria(String categoria) {
        return (ArrayList<ProductosModel>) productosRepository.findByCategoriaContaining(categoria);
	}
	
}