package com.conjunto.dao;

import java.util.List;


import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.conjunto.entities.Administrador;


@Repository
public class AdministradorDAOImpl implements AdministradorDAO {

		@Autowired
		private SessionFactory sessionFactory;
		
		
		@Override
		@Transactional
	public List<Administrador> findAll() {
		// TODO Auto-generated method stub
			Session session = sessionFactory.getCurrentSession();		
			return session.createQuery("FROM Administrador", Administrador.class).getResultList();
	}
		@Override
		@Transactional
	public Administrador findOne(int id) {
		// TODO Auto-generated method stub
			Session session = sessionFactory.getCurrentSession();
			return session.get(Administrador.class, id);
	}

		@Override
		@Transactional
	public void add(Administrador administrador) {
		// TODO Auto-generated method stub
			Session session = sessionFactory.getCurrentSession();
			session.saveOrUpdate(administrador);
	}

	@Override
	@Transactional
	public void up(Administrador administrador) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(administrador);
	}

	@Override
	@Transactional
	public void del(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.delete(findOne(id));
	}

}
