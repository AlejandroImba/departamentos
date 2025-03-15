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
@Table(name="guardia")
public class Guardia {

							@Id
							@GeneratedValue(strategy=GenerationType.IDENTITY)
							@Column(name="id_guardia")
							private int idGuardia;
							@Column(name="turno")
							private String turno;
							@JoinColumn(name= "id_edificio")
							@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
							private Edificio edificio;
							public Guardia() {
						
							}
							public Guardia(int idGuardia, String turno, Edificio edificio) {
						
								this.idGuardia = idGuardia;
								this.turno = turno;
								this.edificio = edificio;
							}
							public int getIdGuardia() {
								return idGuardia;
							}
							public void setIdGuardia(int idGuardia) {
								this.idGuardia = idGuardia;
							}
							public String getTurno() {
								return turno;
							}
							public void setTurno(String turno) {
								this.turno = turno;
							}
							public Edificio getEdificio() {
								return edificio;
							}
							public void setEdificio(Edificio edificio) {
								this.edificio = edificio;
							}
							@Override
							public String toString() {
								return "Guardia [idGuardia=" + idGuardia + ", turno=" + turno + ", edificio=" + edificio
										+ "]";
							}
							
							
}
