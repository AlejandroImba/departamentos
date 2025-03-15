package com.conjunto.entities;

import java.sql.Time;
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
@Table(name="reclamo")
public class Reclamo {
									@Id
									@GeneratedValue(strategy=GenerationType.IDENTITY)
									@Column(name="id_reclamo")
									private int idReclamo;
									@Column(name="descripcion")
									private String descripcion;
									@Column(name="fecha_reclamo")
									private Date fechaReclamo;
									@Column(name="estado")
									private Time estado;
									@JoinColumn(name= "id_admin")
									@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
									private Administrador administrador;
									@JoinColumn(name= "id_inquilino")
									@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
									private Inquilino inquilino;
									public Reclamo() {
									
									}
									public Reclamo(int idReclamo, String descripcion, Date fechaReclamo, Time estado,
											Administrador administrador, Inquilino inquilino) {
										
										this.idReclamo = idReclamo;
										this.descripcion = descripcion;
										this.fechaReclamo = fechaReclamo;
										this.estado = estado;
										this.administrador = administrador;
										this.inquilino = inquilino;
									}
									public int getIdReclamo() {
										return idReclamo;
									}
									public void setIdReclamo(int idReclamo) {
										this.idReclamo = idReclamo;
									}
									public String getDescripcion() {
										return descripcion;
									}
									public void setDescripcion(String descripcion) {
										this.descripcion = descripcion;
									}
									public Date getFechaReclamo() {
										return fechaReclamo;
									}
									public void setFechaReclamo(Date fechaReclamo) {
										this.fechaReclamo = fechaReclamo;
									}
									public Time getEstado() {
										return estado;
									}
									public void setEstado(Time estado) {
										this.estado = estado;
									}
									public Administrador getAdministrador() {
										return administrador;
									}
									public void setAdministrador(Administrador administrador) {
										this.administrador = administrador;
									}
									public Inquilino getInquilino() {
										return inquilino;
									}
									public void setInquilino(Inquilino inquilino) {
										this.inquilino = inquilino;
									}
									@Override
									public String toString() {
										return "Reclamo [idReclamo=" + idReclamo + ", descripcion=" + descripcion
												+ ", fechaReclamo=" + fechaReclamo + ", estado=" + estado
												+ ", administrador=" + administrador + ", inquilino=" + inquilino + "]";
									}
									
}
