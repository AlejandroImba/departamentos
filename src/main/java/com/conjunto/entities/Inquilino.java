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
@Table(name="inquilino")
public class Inquilino {

				@Id
				@GeneratedValue(strategy=GenerationType.IDENTITY)
				@Column(name="id_inquilino")
				private int idInquilino;
				@Column(name="nombre")
				private String nombre;
				@Column(name="apellido")
				private String apellido;
				@Column(name="telefono")
				private String telefono;
				@Column(name="telefono_referencia")
				private String telefonoReferencia;
				@Column(name="correo")
				private String correo;
				@JoinColumn(name= "id_admin")
				@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
				private Administrador administrador;
				@JoinColumn(name= "id_edificio")
				@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
				private Edificio edificio;
				@JoinColumn(name= "id_parqueadero")
				@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
				private Parqueadero parqueadero;
				public Inquilino() {

				}
				public Inquilino(int idInquilino, String nombre, String apellido, String telefono,
						String telefonoReferencia, String correo, Administrador administrador, Edificio edificio,
						Parqueadero parqueadero) {
					this.idInquilino = idInquilino;
					this.nombre = nombre;
					this.apellido = apellido;
					this.telefono = telefono;
					this.telefonoReferencia = telefonoReferencia;
					this.correo = correo;
					this.administrador = administrador;
					this.edificio = edificio;
					this.parqueadero = parqueadero;
				}
				public int getIdInquilino() {
					return idInquilino;
				}
				public void setIdInquilino(int idInquilino) {
					this.idInquilino = idInquilino;
				}
				public String getNombre() {
					return nombre;
				}
				public void setNombre(String nombre) {
					this.nombre = nombre;
				}
				public String getApellido() {
					return apellido;
				}
				public void setApellido(String apellido) {
					this.apellido = apellido;
				}
				public String getTelefono() {
					return telefono;
				}
				public void setTelefono(String telefono) {
					this.telefono = telefono;
				}
				public String getTelefonoReferencia() {
					return telefonoReferencia;
				}
				public void setTelefonoReferencia(String telefonoReferencia) {
					this.telefonoReferencia = telefonoReferencia;
				}
				public String getCorreo() {
					return correo;
				}
				public void setCorreo(String correo) {
					this.correo = correo;
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
				public Parqueadero getParqueadero() {
					return parqueadero;
				}
				public void setParqueadero(Parqueadero parqueadero) {
					this.parqueadero = parqueadero;
				}
				@Override
				public String toString() {
					return "Inquilino [idInquilino=" + idInquilino + ", nombre=" + nombre + ", apellido=" + apellido
							+ ", telefono=" + telefono + ", telefonoReferencia=" + telefonoReferencia + ", correo="
							+ correo + ", administrador=" + administrador + ", edificio=" + edificio + ", parqueadero="
							+ parqueadero + "]";
				}
				
				
				
}

