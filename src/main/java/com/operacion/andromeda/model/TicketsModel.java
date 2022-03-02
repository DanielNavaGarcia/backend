package com.operacion.andromeda.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
@Table(name = "tickets")
public class TicketsModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer id_ticket;
	
	@Column
	private int id_direccion_envio;
	
	@Column
	private int id_metodo_envio;

	@Column
	private int id_forma_de_pago;
	
	@Column
	private String estatus_del_pedido;
	
	@Column
	private LocalDateTime fecha;//preguntar sobre esto
	
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonProperty(access = Access.READ_WRITE)
    @JoinColumn(name = "id_usuario")
    private UsuariosModel usuariosModel;

	public TicketsModel() {

	}

	public Integer getId_ticket() {
		return id_ticket;
	}

	public void setId_ticket(Integer id_ticket) {
		this.id_ticket = id_ticket;
	}

//	public int getId_usuario() {
//		return id_usuario;
//	}
//
//	public void setId_usuario(int id_usuario) {
//		this.id_usuario = id_usuario;
//	}

	public int getId_direccion_envio() {
		return id_direccion_envio;
	}

	public void setId_direccion_envio(int id_direccion_envio) {
		this.id_direccion_envio = id_direccion_envio;
	}

	public int getId_metodo_envio() {
		return id_metodo_envio;
	}

	public void setId_metodo_envio(int id_metodo_envio) {
		this.id_metodo_envio = id_metodo_envio;
	}

	public int getId_forma_de_pago() {
		return id_forma_de_pago;
	}

	public void setId_forma_de_pago(int id_forma_de_pago) {
		this.id_forma_de_pago = id_forma_de_pago;
	}

	public String getEstatus_del_pedido() {
		return estatus_del_pedido;
	}

	public void setEstatus_del_pedido(String estatus_del_pedido) {
		this.estatus_del_pedido = estatus_del_pedido;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public UsuariosModel getUsuariosModel() {
		return usuariosModel;
	}

	public void setUsuariosModel(UsuariosModel usuariosModel) {
		this.usuariosModel = usuariosModel;
	}

	@Override
	public String toString() {
		return "TicketsModel [id_ticket=" + id_ticket + ", id_direccion_envio="
				+ id_direccion_envio + ", id_metodo_envio=" + id_metodo_envio + ", id_forma_de_pago=" + id_forma_de_pago
				+ ", estatus_del_pedido=" + estatus_del_pedido + ", fecha=" + fecha + ", usuariosModel=" + usuariosModel
				+ "]";
	}
}
