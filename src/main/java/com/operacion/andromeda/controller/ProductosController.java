package com.operacion.andromeda.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.operacion.andromeda.model.ProductosModel;
import com.operacion.andromeda.service.ProductosService;

@RestController
public class ProductosController {
	private final ProductosService productosService;
	
	public ProductosController(@Autowired ProductosService productosService) {
		this.productosService = productosService;
	}
	
	@GetMapping("/productos")
	public ArrayList<ProductosModel> obtenerDato(){
		return productosService.obtenerDatos();	
	}
	
	@PostMapping("/productos")
    public ProductosModel guardarDatos(@RequestBody ProductosModel productosModel) {
    	return productosService.guardarDatos(productosModel);
    }
	
	@DeleteMapping(path = "productos/{id}")
	public boolean eliminarDato(@PathVariable("id") Integer id) {
		return productosService.eliminarDato(id);
	}
	
	@GetMapping(path = "productos/{id}")
	public Optional<ProductosModel> encontrarDato(@PathVariable("id") Integer id) {
		return productosService.encontrarDato(id);
	}
	
    @GetMapping("/productos/search")
    public ArrayList<ProductosModel> encontrarCategoria(@RequestParam(name = "categoria") String categoria){
    	return (ArrayList<ProductosModel>) productosService.encontrarCategoria(categoria);
    }
}