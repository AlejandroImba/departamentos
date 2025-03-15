package com.conjunto.dao;

import java.util.List;

import com.conjunto.entities.Edificio;

public interface EdificioDAO {
	public List<Edificio> findAll();
	public Edificio findOne(int id);
	public void add(Edificio edificio);
	public void up(Edificio edificio);
	public void del(int id);
}
