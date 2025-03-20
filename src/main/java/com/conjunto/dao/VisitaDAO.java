package com.conjunto.dao;

import java.util.List;
import com.conjunto.entities.Visita;

public interface VisitaDAO {
	public List<Visita> findAll();
	public Visita findOne(int id);
	public void add(Visita visita);
	public void up(Visita visita);
	public void del(int id);
}
