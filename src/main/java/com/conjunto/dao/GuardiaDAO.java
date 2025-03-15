package com.conjunto.dao;

import java.util.List;

import com.conjunto.entities.Guardia;

public interface GuardiaDAO {
	public List<Guardia> findAll();
	public Guardia findOne(int id);
	public void add(Guardia guardia);
	public void up(Guardia guardia);
	public void del(int id);
}
