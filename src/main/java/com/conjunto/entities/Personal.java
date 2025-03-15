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
@Table(name="personal")
public class Personal {

		

						///SQL : 1 A 1     <> JAVA = @OneToOne
						/// SQL: 1 A N   <>  JAVA = @OneToMany   or @ManyToOne
						@Id
						@GeneratedValue(strategy=GenerationType.IDENTITY)
						@Column(name="id_personal")
						private int idPersonal;
						@Column(name="tipo_de_mantenimiento")
						private String tipoDeMantenimiento;
						@Column(name="fecha_mantenimiento")
						private Date fechaMantenimiento;
						@JoinColumn(name= "id_edificio")
						@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
						private Edificio edificio;
						public Personal() {
							
						}
						public Personal(int idPersonal, String tipoDeMantenimiento, Date fechaMantenimiento,
								Edificio edificio) {
							this.idPersonal = idPersonal;
							this.tipoDeMantenimiento = tipoDeMantenimiento;
							this.fechaMantenimiento = fechaMantenimiento;
							this.edificio = edificio;
						}
						public int getIdPersonal() {
							return idPersonal;
						}
						public void setIdPersonal(int idPersonal) {
							this.idPersonal = idPersonal;
						}
						public String getTipoDeMantenimiento() {
							return tipoDeMantenimiento;
						}
						public void setTipoDeMantenimiento(String tipoDeMantenimiento) {
							this.tipoDeMantenimiento = tipoDeMantenimiento;
						}
						public Date getFechaMantenimiento() {
							return fechaMantenimiento;
						}
						public void setFechaMantenimiento(Date fechaMantenimiento) {
							this.fechaMantenimiento = fechaMantenimiento;
						}
						public Edificio getEdificio() {
							return edificio;
						}
						public void setEdificio(Edificio edificio) {
							this.edificio = edificio;
						}
						@Override
						public String toString() {
							return "Personal [idPersonal=" + idPersonal + ", tipoDeMantenimiento=" + tipoDeMantenimiento
									+ ", fechaMantenimiento=" + fechaMantenimiento + ", edificio=" + edificio + "]";
						}
						
						
}
