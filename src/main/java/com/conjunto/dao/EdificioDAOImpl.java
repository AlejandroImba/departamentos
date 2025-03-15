package com.conjunto.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.conjunto.entities.Edificio;
@Repository
public class EdificioDAOImpl implements EdificioDAO {
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	@Transactional
	public List<Edificio> findAll() {
		// TODO Auto-generated method stub
		Session session= sessionFactory.getCurrentSession();
		return session.createQuery("FROM Edificio",Edificio.class).getResultList();
	}

	@Override
	@Transactional
	public Edificio findOne(int id) {
		// TODO Auto-generated method stub
		Session session= sessionFactory.getCurrentSession();
		return session.get(Edificio.class, id);
	}

	@Override
	@Transactional
	public void add(Edificio edificio) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(edificio);
	}

	@Override
	@Transactional
	public void up(Edificio edificio) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(edificio);
	}

	@Override
	@Transactional
	public void del(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.delete(findOne(id));
	}

}
