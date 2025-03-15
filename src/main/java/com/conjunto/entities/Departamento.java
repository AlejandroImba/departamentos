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
@Table(name="departamento")
public class Departamento {

				@Id
				@GeneratedValue(strategy=GenerationType.IDENTITY)
				@Column(name="id_departamento")
				private int idDepartamento;
				@Column(name="num_cuartos")
				private int numCuartos;
				@Column(name="baños")
				private int baños;
				@Column(name="sala")
				private int sala;
				@Column(name="cocina")
				private int cocina;
				@Column(name="consumo_actual_luz")
				private int consumoActualLuz;
				@Column(name="consumo_actual_agua")
				private int consumoActualAgua;
				@JoinColumn(name= "id_admin")
				@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
				private Administrador administrador;
				@JoinColumn(name= "id_edificio")
				@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
				private Edificio edificio;
				public Departamento() {
				
				}
				public Departamento(int idDepartamento, int numCuartos, int baños, int sala, int cocina,
						int consumoActualLuz, int consumoActualAgua, Administrador administrador, Edificio edificio) {
					super();
					this.idDepartamento = idDepartamento;
					this.numCuartos = numCuartos;
					this.baños = baños;
					this.sala = sala;
					this.cocina = cocina;
					this.consumoActualLuz = consumoActualLuz;
					this.consumoActualAgua = consumoActualAgua;
					this.administrador = administrador;
					this.edificio = edificio;
				}
				public int getIdDepartamento() {
					return idDepartamento;
				}
				public void setIdDepartamento(int idDepartamento) {
					this.idDepartamento = idDepartamento;
				}
				public int getNumCuartos() {
					return numCuartos;
				}
				public void setNumCuartos(int numCuartos) {
					this.numCuartos = numCuartos;
				}
				public int getBaños() {
					return baños;
				}
				public void setBaños(int baños) {
					this.baños = baños;
				}
				public int getSala() {
					return sala;
				}
				public void setSala(int sala) {
					this.sala = sala;
				}
				public int getCocina() {
					return cocina;
				}
				public void setCocina(int cocina) {
					this.cocina = cocina;
				}
				public int getConsumoActualLuz() {
					return consumoActualLuz;
				}
				public void setConsumoActualLuz(int consumoActualLuz) {
					this.consumoActualLuz = consumoActualLuz;
				}
				public int getConsumoActualAgua() {
					return consumoActualAgua;
				}
				public void setConsumoActualAgua(int consumoActualAgua) {
					this.consumoActualAgua = consumoActualAgua;
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
					return "Departamento [idDepartamento=" + idDepartamento + ", numCuartos=" + numCuartos + ", baños="
							+ baños + ", sala=" + sala + ", cocina=" + cocina + ", consumoActualLuz=" + consumoActualLuz
							+ ", consumoActualAgua=" + consumoActualAgua + ", administrador=" + administrador
							+ ", edificio=" + edificio + "]";
				}
			
				
				
				
				
				
}
