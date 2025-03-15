package com.conjunto.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.conjunto.entities.Vehiculo;

public class VehiculoDAOImpl implements VehiculoDAO {

	@Autowired
	private SessionFactory sessionFactory;
	@Override
	@Transactional
	public List<Vehiculo> findAll() {
		// TODO Auto-generated method stub
		Session session= sessionFactory.getCurrentSession();
		return session.createQuery("FROM Vehiculo",Vehiculo.class).getResultList();	}

	@Override
	@Transactional
	public Vehiculo findOne(int id) {
		// TODO Auto-generated method stub
		Session session= sessionFactory.getCurrentSession();
		return session.get(Vehiculo.class, id);	}

	@Override
	@Transactional
	public void add(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(vehiculo);
	}

	@Override
	@Transactional
	public void up(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(vehiculo);
	}

	@Override
	@Transactional
	public void del(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.delete(findOne(id));
	}

}
