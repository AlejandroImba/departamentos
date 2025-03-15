package com.conjunto.dao;

import java.util.List;

import com.conjunto.entities.AreasComunes;

public interface AreasComunesDAO {
	public List<AreasComunes> findAll();
	public AreasComunes findOne(int id);
	public void add(AreasComunes areasComunes);
	public void up(AreasComunes areasComunes);
	public void del(int id);
}
