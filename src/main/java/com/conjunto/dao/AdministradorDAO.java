package com.conjunto.dao;

import java.util.List;

import com.conjunto.entities.Administrador;

public interface AdministradorDAO {
	public List<Administrador> findAll();
	public Administrador findOne(int id);
	public void add(Administrador administrador);
	public void up(Administrador administrador);
	public void del(int id);
}
