package com.conjunto.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="edificio")
public class Edificio {

			@Id
			@GeneratedValue(strategy=GenerationType.IDENTITY)
			@Column(name="id_edificio")
			private int idEdificio;
			@Column(name="color")
			private String color;
			@Column(name="num_dep")
			private int numDep;
			@Column(name="pisos")
			private int pisos;
			@JoinColumn(name= "id_admin")
			@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
			private Administrador administrador;
			public Edificio() {
		
			}
			public Edificio(int idEdificio, String color, int num_dep, int pisos, Administrador administrador) {
				this.idEdificio = idEdificio;
				this.color = color;
				this.numDep = num_dep;
				this.pisos = pisos;
				this.administrador = administrador;
			}
			public int getIdEdificio() {
				return idEdificio;
			}
			public void setIdEdificio(int idEdificio) {
				this.idEdificio = idEdificio;
			}
			public String getColor() {
				return color;
			}
			public void setColor(String color) {
				this.color = color;
			}
			public int getNum_dep() {
				return numDep;
			}
			public void setNum_dep(int num_dep) {
				this.numDep = num_dep;
			}
			public int getPisos() {
				return pisos;
			}
			public void setPisos(int pisos) {
				this.pisos = pisos;
			}
			public Administrador getAdministrador() {
				return administrador;
			}
			public void setAdministrador(Administrador administrador) {
				this.administrador = administrador;
			}
			@Override
			public String toString() {
				return "Edificio [idEdificio=" + idEdificio + ", color=" + color + ", num_dep=" + numDep + ", pisos="
						+ pisos + ", administrador=" + administrador + "]";
			}
			
			
}
