package com.conjunto.dao;

import java.util.List;

import com.conjunto.entities.Reclamo;

public interface ReclamoDAO {
	public List<Reclamo> findAll();
	public Reclamo findOne(int id);
	public void add(Reclamo reclamo);
	public void up(Reclamo reclamo);
	public void del(int id);
}
