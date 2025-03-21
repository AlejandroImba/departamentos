package com.conjunto.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.conjunto.entities.Mascota;
import com.conjunto.entities.Visita;
@Repository
public class VisitaDAOImpl implements VisitaDAO {
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	@Transactional
	public List<Visita> findAll() {
		// TODO Auto-generated method stub
		Session session= sessionFactory.getCurrentSession();
		return session.createQuery("FROM Visita",Visita.class).getResultList();
	}

	@Override
	@Transactional
	public Visita findOne(int id) {
		// TODO Auto-generated method stub
		Session session= sessionFactory.getCurrentSession();
		return session.get(Visita.class, id);
	}

	@Override
	@Transactional
	public void add(Visita visita) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
	    System.out.println("Visita a guardar: " + visita);  // Verifica los datos
		session.saveOrUpdate(visita);
	}

	@Override
	@Transactional
	public void up(Visita visita) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(visita);

	}

	@Override
	@Transactional
	public void del(int id) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.delete(findOne(id));
	}

}
