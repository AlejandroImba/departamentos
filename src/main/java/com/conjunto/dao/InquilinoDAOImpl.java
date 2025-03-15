package com.conjunto.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.conjunto.entities.Inquilino;

@Repository
public class InquilinoDAOImpl implements InquilinoDAO {
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	@Transactional
	public List<Inquilino> findAll() {
		Session session= sessionFactory.getCurrentSession();
		return session.createQuery("FROM Inquilino",Inquilino.class).getResultList();
	}

	@Override
	@Transactional
	public Inquilino findOne(int id) {
		Session session= sessionFactory.getCurrentSession();
		return session.get(Inquilino.class, id);
	}

	@Override
	@Transactional
	public void add(Inquilino inquilino) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(inquilino);
	}

	@Override
	@Transactional
	public void up(Inquilino inquilino) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(inquilino);
	}

	@Override
	@Transactional
	public void del(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.delete(findOne(id));
	}

}
