package com.conjunto.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="visita")
public class Visita {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_visita")
	private int idVisita;
	@Column(name="nombre_visitante")
	private String nombreVisitante;
	@Column(name="fecha_visita")
	private Date fechaVisita;
	@Column(name="motivo_visita")
	private String motivoVisita;
	@Column(name="observaciones")
	private String observaciones;
	@JoinColumn(name= "id_inquilino")
	@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	private Inquilino inquilino;
	public Visita() {
	
	}
	public Visita(int idVisita, String nombreVisitante, Date fechaVisita, String motivoVisita, String observaciones,
			Inquilino inquilino) {
		this.idVisita = idVisita;
		this.nombreVisitante = nombreVisitante;
		this.fechaVisita = fechaVisita;
		this.motivoVisita = motivoVisita;
		this.observaciones = observaciones;
		this.inquilino = inquilino;
	}
	public int getIdVisita() {
		return idVisita;
	}
	public void setIdVisita(int idVisita) {
		this.idVisita = idVisita;
	}
	public String getNombreVisitante() {
		return nombreVisitante;
	}
	public void setNombreVisitante(String nombreVisitante) {
		this.nombreVisitante = nombreVisitante;
	}
	public Date getFechaVisita() {
		return fechaVisita;
	}
	public void setFechaVisita(Date fechaVisita) {
		this.fechaVisita = fechaVisita;
	}
	public String getMotivoVisita() {
		return motivoVisita;
	}
	public void setMotivoVisita(String motivoVisita) {
		this.motivoVisita = motivoVisita;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	public Inquilino getInquilino() {
		return inquilino;
	}
	public void setInquilino(Inquilino inquilino) {
		this.inquilino = inquilino;
	}
	@Override
	public String toString() {
		return "Visita [idVisita=" + idVisita + ", nombreVisitante=" + nombreVisitante + ", fechaVisita=" + fechaVisita
				+ ", motivoVisita=" + motivoVisita + ", observaciones=" + observaciones + ", inquilino=" + inquilino
				+ "]";
	}
	
	
	
}
