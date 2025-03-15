package com.conjunto.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.conjunto.entities.AreasComunes;

public class AreasComunesDAOImpl implements AreasComunesDAO {
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	@Transactional
	public List<AreasComunes> findAll() {
		// TODO Auto-generated method stub
		Session session= sessionFactory.getCurrentSession();
		return session.createQuery("FROM AreasComunes",AreasComunes.class).getResultList();
	}

	@Override
	@Transactional
	public AreasComunes findOne(int id) {
		// TODO Auto-generated method stub
		Session session= sessionFactory.getCurrentSession();
		return session.get(AreasComunes.class, id);
	}

	@Override
	@Transactional
	public void add(AreasComunes areasComunes) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(areasComunes);
	}

	@Override
	@Transactional
	public void up(AreasComunes areasComunes) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(areasComunes);
	}

	@Override
	@Transactional
	public void del(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.delete(findOne(id));
	}

}
