package com.conjunto.dao;

import java.util.List;

import com.conjunto.entities.Mascota;

public interface MascotaDAO {
	public List<Mascota> findAll();
	public Mascota findOne(int id);
	public void add(Mascota mascota);
	public void up(Mascota mascota);
	public void del(int id);
}
