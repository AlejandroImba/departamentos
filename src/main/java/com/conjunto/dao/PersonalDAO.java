package com.conjunto.dao;

import java.util.List;

import com.conjunto.entities.Personal;

public interface PersonalDAO {
	public List<Personal> findAll();
	public Personal findOne(int id);
	public void add(Personal personal);
	public void up(Personal personal);
	public void del(int id);
}
