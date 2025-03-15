package com.conjunto.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.conjunto.entities.Parqueadero;
@Repository
public class ParqueaderoDAOImpl implements ParqueaderoDAO {
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	@Transactional
	public List<Parqueadero> findAll() {
		// TODO Auto-generated method stub
		Session session= sessionFactory.getCurrentSession();
		return session.createQuery("FROM Parqueadero",Parqueadero.class).getResultList();
		}

	@Override
	@Transactional
	public Parqueadero findOne(int id) {
		// TODO Auto-generated method stub
		Session session= sessionFactory.getCurrentSession();
		return session.get(Parqueadero.class, id);
	}

	@Override
	@Transactional
	public void add(Parqueadero parqueadero) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(parqueadero);
	}

	@Override
	@Transactional
	public void up(Parqueadero parqueadero) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(parqueadero);
	}

	@Override
	@Transactional
	public void del(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.delete(findOne(id));
	}

}
