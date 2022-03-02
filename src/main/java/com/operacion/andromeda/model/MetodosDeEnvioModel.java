package com.operacion.andromeda.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="metodos_de_envio")
public class MetodosDeEnvioModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer id_envio;
	
	@Column (name= "tipo_de_envio", nullable=false)
	private String tipo_de_envio;
	
	@Column (name= "precio_de_envio", nullable=false)
	private int precio_de_envio;

	
	
	public Integer getId_envio() {
		return id_envio;
	}

	public void setId_envio(Integer id_envio) {
		this.id_envio = id_envio;
	}

	public String getTipo_de_envio() {
		return tipo_de_envio;
	}

	public void setTipo_de_envio(String tipo_de_envio) {
		this.tipo_de_envio = tipo_de_envio;
	}

	public int getPrecio_de_envio() {
		return precio_de_envio;
	}

	public void setPrecio_de_envio(int precio_de_envio) {
		this.precio_de_envio = precio_de_envio;
	}
	
	
	@Override
	public String toString() {
		return "MetodosDeEnvioModels [id_envio = " + id_envio + ", tipo_de_envio = " + tipo_de_envio + ", precio_de_envio = " + precio_de_envio + "]";
	}

}