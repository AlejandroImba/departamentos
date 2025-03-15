package com.conjunto.dao;

import java.util.List;

import com.conjunto.entities.Vehiculo;

public interface VehiculoDAO {
	public List<Vehiculo> findAll();
	public Vehiculo findOne(int id);
	public void add(Vehiculo vehiculo);
	public void up(Vehiculo vehiculo);
	public void del(int id);
}
