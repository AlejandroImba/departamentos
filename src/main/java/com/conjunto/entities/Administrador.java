package com.conjunto.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="administrador")
public class Administrador {
	
	
			@Id
			@GeneratedValue(strategy = GenerationType.IDENTITY)
			@Column(name="id_admin")
			private int idAdministrador;
			@Column(name="nombre")
			private String nombre;
			@Column(name="apellido")
			private String apellido;
			@Column(name="telefono")
			private String telefono;
			@Column(name="correo")
			private String correo;
			@Column(name="codigo")
			private int codigo;
			public Administrador() {
			
			}
			public Administrador(int idAdministrador, String nombre, String apellido, String telefono, String correo,
					int codigo) {
				this.idAdministrador = idAdministrador;
				this.nombre = nombre;
				this.apellido = apellido;
				this.telefono = telefono;
				this.correo = correo;
				this.codigo = codigo;
			}
			public int getIdAdministrador() {
				return idAdministrador;
			}
			public void setIdAdministrador(int idAdministrador) {
				this.idAdministrador = idAdministrador;
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
			public String getCorreo() {
				return correo;
			}
			public void setCorreo(String correo) {
				this.correo = correo;
			}
			public int getCodigo() {
				return codigo;
			}
			public void setCodigo(int codigo) {
				this.codigo = codigo;
			}
			@Override
			public String toString() {
				return "Administrador [idAdministrador=" + idAdministrador + ", nombre=" + nombre + ", apellido="
						+ apellido + ", telefono=" + telefono + ", correo=" + correo + ", codigo=" + codigo + "]";
			}
			
			
			
			
}
