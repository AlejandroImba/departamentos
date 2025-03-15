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
@Table(name="reservas_areas_comunes")
public class AreasComunes {

								///SQL : 1 A 1     <> JAVA = @OneToOne
								/// SQL: 1 A N   <>  JAVA = @OneToMany   or @ManyToOne
								@Id
								@GeneratedValue(strategy=GenerationType.IDENTITY)
								@Column(name="id_reserva")
								private int idReserva;
								@Column(name="area_comun")
								private String areaComun;
								@Column(name="fecha_reserva")
								private Date fechaReserva;
								@Column(name="hora_inicio")
								private Time horaInicio;
								@Column(name="hora_fin")
								private Time horaFin;
								@JoinColumn(name= "id_edificio")
								@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
								private Edificio edificio;
								@JoinColumn(name= "id_inquilino")
								@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
								private Inquilino inquilino;
								public AreasComunes() {
									
								}
								public AreasComunes(int idReserva, String areaComun, Date fechaReserva, Time horaInicio,
										Time horaFin, Edificio edificio, Inquilino inquilino) {
									this.idReserva = idReserva;
									this.areaComun = areaComun;
									this.fechaReserva = fechaReserva;
									this.horaInicio = horaInicio;
									this.horaFin = horaFin;
									this.edificio = edificio;
									this.inquilino = inquilino;
								}
								public int getIdReserva() {
									return idReserva;
								}
								public void setIdReserva(int idReserva) {
									this.idReserva = idReserva;
								}
								public String getAreaComun() {
									return areaComun;
								}
								public void setAreaComun(String areaComun) {
									this.areaComun = areaComun;
								}
								public Date getFechaReserva() {
									return fechaReserva;
								}
								public void setFechaReserva(Date fechaReserva) {
									this.fechaReserva = fechaReserva;
								}
								public Time getHoraInicio() {
									return horaInicio;
								}
								public void setHoraInicio(Time horaInicio) {
									this.horaInicio = horaInicio;
								}
								public Time getHoraFin() {
									return horaFin;
								}
								public void setHoraFin(Time horaFin) {
									this.horaFin = horaFin;
								}
								public Edificio getEdificio() {
									return edificio;
								}
								public void setEdificio(Edificio edificio) {
									this.edificio = edificio;
								}
								public Inquilino getInquilino() {
									return inquilino;
								}
								public void setInquilino(Inquilino inquilino) {
									this.inquilino = inquilino;
								}
								@Override
								public String toString() {
									return "AreasComunes [idReserva=" + idReserva + ", areaComun=" + areaComun
											+ ", fechaReserva=" + fechaReserva + ", horaInicio=" + horaInicio
											+ ", horaFin=" + horaFin + ", edificio=" + edificio + ", inquilino="
											+ inquilino + "]";
								}
								
								
}
