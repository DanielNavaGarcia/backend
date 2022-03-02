package com.operacion.andromeda.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "listas")
public class ListasModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer id_lista;
	
	@Column
	private int id_producto;
	
	@Column
	private int id_ticket;
	
	@Column
	private int precio_momento;
	
	@Column
	private String detalles;

	public ListasModel() {

	}

	public Integer getId_lista() {
		return id_lista;
	}

	public void setId_lista(Integer id_lista) {
		this.id_lista = id_lista;
	}

	public int getId_producto() {
		return id_producto;
	}

	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}

	public int getId_ticket() {
		return id_ticket;
	}

	public void setId_ticket(int id_ticket) {
		this.id_ticket = id_ticket;
	}

	public int getPrecio_momento() {
		return precio_momento;
	}

	public void setPrecio_momento(int precio_momento) {
		this.precio_momento = precio_momento;
	}

	public String getDetalles() {
		return detalles;
	}

	public void setDetalles(String detalles) {
		this.detalles = detalles;
	}

	@Override
	public String toString() {
		return "ListasModel [id_lista=" + id_lista + ", id_producto=" + id_producto + ", id_ticket=" + id_ticket
				+ ", precio_momento=" + precio_momento + ", detalles=" + detalles + "]";
	}
}
