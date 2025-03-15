package com.conjunto.dao;

import java.util.List;

import com.conjunto.entities.Departamento;

public interface DepartamentoDAO {
	public List<Departamento> findAll();
	public Departamento findOne(int id);
	public void add(Departamento departamento);
	public void up(Departamento departamento);
	public void del(int id);
	public List<Departamento> findByEdificioId(int idEdificio);

}
