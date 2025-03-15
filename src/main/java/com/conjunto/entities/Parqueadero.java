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
@Table(name="parqueadero")
public class Parqueadero {
	

					///SQL : 1 A 1     <> JAVA = @OneToOne
					/// SQL: 1 A N   <>  JAVA = @OneToMany   or @ManyToOne
					@Id
					@GeneratedValue(strategy=GenerationType.IDENTITY)
					@Column(name="id_parqueadero")
					private int idParqueadero;
					@Column(name="ubicacion")
					private String ubicacion;
					@Column(name="disponibilidad")
					private String disponibilidad;
					@JoinColumn(name= "id_admin")
					@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
					private Administrador administrador;
					@JoinColumn(name= "id_edificio")
					@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
					private Edificio edificio;
					
					
					public Parqueadero() {
					
					}

					public Parqueadero(int idParqueadero, String ubicacion, String disponibilidad,
							Administrador administrador, Edificio edificio) {
						this.idParqueadero = idParqueadero;
						this.ubicacion = ubicacion;
						this.disponibilidad = disponibilidad;
						this.administrador = administrador;
						this.edificio = edificio;
					}


					public String getDisponibilidad() {
						return disponibilidad;
					}

					public void setDisponibilidad(String disponibilidad) {
						this.disponibilidad = disponibilidad;
					}

					public int getIdParqueadero() {
						return idParqueadero;
					}
					public void setIdParqueadero(int idParqueadero) {
						this.idParqueadero = idParqueadero;
					}
					public String getUbicacion() {
						return ubicacion;
					}
					public void setUbicacion(String ubicacion) {
						this.ubicacion = ubicacion;
					}
					public Administrador getAdministrador() {
						return administrador;
					}
					public void setAdministrador(Administrador administrador) {
						this.administrador = administrador;
					}
					public Edificio getEdificio() {
						return edificio;
					}
					public void setEdificio(Edificio edificio) {
						this.edificio = edificio;
					}
					@Override
					public String toString() {
						return "Parqueadero [idParqueadero=" + idParqueadero + ", ubicacion=" + ubicacion
								+ ", tipoAuto=" + disponibilidad + ", administrador=" + administrador + ", edificio="
								+ edificio + "]";
					}
					
					
					
}
