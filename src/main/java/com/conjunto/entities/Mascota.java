package com.conjunto.entities;

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
@Table(name="mascota")
public class Mascota {
								@Id
								@GeneratedValue(strategy=GenerationType.IDENTITY)
								@Column(name="id_mascota")
								private int idMascota;
								@Column(name="nombre")
								private String nombre;
								@Column(name="tipo")
								private String tipo;
								@Column(name="raza")
								private String raza;
								@JoinColumn(name= "id_inquilino")
								@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
								private Inquilino inquilino;
								public Mascota() {
									
								}
								public Mascota(int idMascota, String nombre, String tipo, String raza,
										Inquilino inquilino) {
							
									this.idMascota = idMascota;
									this.nombre = nombre;
									this.tipo = tipo;
									this.raza = raza;
									this.inquilino = inquilino;
								}
								public int getIdMascota() {
									return idMascota;
								}
								public void setIdMascota(int idMascota) {
									this.idMascota = idMascota;
								}
								public String getNombre() {
									return nombre;
								}
								public void setNombre(String nombre) {
									this.nombre = nombre;
								}
								public String getTipo() {
									return tipo;
								}
								public void setTipo(String tipo) {
									this.tipo = tipo;
								}
								public String getRaza() {
									return raza;
								}
								public void setRaza(String raza) {
									this.raza = raza;
								}
								public Inquilino getInquilino() {
									return inquilino;
								}
								public void setInquilino(Inquilino inquilino) {
									this.inquilino = inquilino;
								}
								@Override
								public String toString() {
									return "Mascota [idMascota=" + idMascota + ", nombre=" + nombre + ", tipo=" + tipo
											+ ", raza=" + raza + ", inquilino=" + inquilino + "]";
								}
								
								
}
