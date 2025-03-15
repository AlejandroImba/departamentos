	package com.conjunto.dao;

import java.util.List;

import com.conjunto.entities.Inquilino;
public interface InquilinoDAO {
	public List<Inquilino> findAll();
	public Inquilino findOne(int id);
	public void add(Inquilino inquilino);
	public void up(Inquilino inquilino);
	public void del(int id);
}
