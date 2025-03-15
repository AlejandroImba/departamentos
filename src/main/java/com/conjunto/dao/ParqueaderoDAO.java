package com.conjunto.dao;

import java.util.List;

import com.conjunto.entities.Parqueadero;

public interface ParqueaderoDAO {
	public List<Parqueadero> findAll();
	public Parqueadero findOne(int id);
	public void add(Parqueadero parqueadero);
	public void up(Parqueadero parqueadero);
	public void del(int id);
}
