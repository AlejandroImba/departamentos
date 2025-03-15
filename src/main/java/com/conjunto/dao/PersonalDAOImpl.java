package com.conjunto.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;


import com.conjunto.entities.Personal;

public class PersonalDAOImpl implements PersonalDAO {
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	@Transactional
	public List<Personal> findAll() {
		// TODO Auto-generated method stub
		Session session= sessionFactory.getCurrentSession();
		return session.createQuery("FROM Personal",Personal.class).getResultList();
	}

	@Override
	@Transactional
	public Personal findOne(int id) {
		// TODO Auto-generated method stub
		Session session= sessionFactory.getCurrentSession();
		return session.get(Personal.class, id);
	}

	@Override
	@Transactional
	public void add(Personal personal) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(personal);
	}

	@Override
	@Transactional
	public void up(Personal personal) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(personal);
	}

	@Override
	@Transactional
	public void del(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.delete(findOne(id));
	}

}
