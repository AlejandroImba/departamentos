package com.conjunto.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.conjunto.entities.Reclamo;
@Repository
public class ReclamoDAOImpl implements ReclamoDAO {

	@Autowired
	private SessionFactory sessionFactory;
	@Override
	@Transactional
	public List<Reclamo> findAll() {
		// TODO Auto-generated method stub
		Session session= sessionFactory.getCurrentSession();
		return session.createQuery("FROM Reclamo",Reclamo.class).getResultList();
	}
	@Override
	@Transactional
	public Reclamo findOne(int id) {
		// TODO Auto-generated method stub
		Session session= sessionFactory.getCurrentSession();
		return session.get(Reclamo.class, id);
		}

	@Override
	@Transactional
	public void add(Reclamo reclamo) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(reclamo);
	}

	@Override
	@Transactional
	public void up(Reclamo reclamo) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(reclamo);
	}

	@Override
	@Transactional
	public void del(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.delete(findOne(id));
	}

}
