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
@Table(name="vehiculo")
public class Vehiculo {
						///SQL : 1 A 1     <> JAVA = @OneToOne
						/// SQL: 1 A N   <>  JAVA = @OneToMany   or @ManyToOne
						@Id
						@GeneratedValue(strategy=GenerationType.IDENTITY)
						@Column(name="id_vehiculo")
						private int idVehiculo;
						@Column(name="placa")
						private String placa;
						@Column(name="marca")
						private String marca;
						@Column(name="modelo")
						private String modelo;
						@JoinColumn(name= "id_inquilino")
						@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
						private Inquilino inquilino;
						@JoinColumn(name= "id_parqueadero")
						@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
						private Parqueadero parqueadero;
						public Vehiculo() {
						
						}
						public Vehiculo(int idVehiculo, String placa, String marca, String modelo, Inquilino inquilino,
								Parqueadero parqueadero) {
					
							this.idVehiculo = idVehiculo;
							this.placa = placa;
							this.marca = marca;
							this.modelo = modelo;
							this.inquilino = inquilino;
							this.parqueadero = parqueadero;
						}
						public int getIdVehiculo() {
							return idVehiculo;
						}
						public void setIdVehiculo(int idVehiculo) {
							this.idVehiculo = idVehiculo;
						}
						public String getPlaca() {
							return placa;
						}
						public void setPlaca(String placa) {
							this.placa = placa;
						}
						public String getMarca() {
							return marca;
						}
						public void setMarca(String marca) {
							this.marca = marca;
						}
						public String getModelo() {
							return modelo;
						}
						public void setModelo(String modelo) {
							this.modelo = modelo;
						}
						public Inquilino getInquilino() {
							return inquilino;
						}
						public void setInquilino(Inquilino inquilino) {
							this.inquilino = inquilino;
						}
						public Parqueadero getParqueadero() {
							return parqueadero;
						}
						public void setParqueadero(Parqueadero parqueadero) {
							this.parqueadero = parqueadero;
						}
						@Override
						public String toString() {
							return "Vehiculo [idVehiculo=" + idVehiculo + ", placa=" + placa + ", marca=" + marca
									+ ", modelo=" + modelo + ", inquilino=" + inquilino + ", parqueadero=" + parqueadero
									+ "]";
						}
						
						
}
