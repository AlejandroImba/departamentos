package com.conjunto.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.conjunto.entities.Departamento;
@Repository

public class DepartamentoDAOImpl implements DepartamentoDAO {


	@Autowired
	private SessionFactory sessionFactory;
	@Override
	@Transactional
	public List<Departamento> findAll() {
		// TODO Auto-generated method stub
		Session session= sessionFactory.getCurrentSession();
		return session.createQuery("FROM Departamento",Departamento.class).getResultList();
	}

	@Override
	@Transactional
	public Departamento findOne(int id) {
		// TODO Auto-generated method stub
		Session session= sessionFactory.getCurrentSession();
		return session.get(Departamento.class, id);
	}

	@Override
	@Transactional
	public void add(Departamento departamento) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(departamento);
	}

	@Override
	@Transactional
	public void up(Departamento departamento) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(departamento);
	}

	@Override
	@Transactional
	public void del(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.delete(findOne(id));
	}

	@Override
	@Transactional
	public List<Departamento> findByEdificioId(int idEdificio) {
		// TODO Auto-generated method stub
	    Session session = sessionFactory.getCurrentSession();
	    String hql = "FROM Departamento d WHERE d.edificio.idEdificio = :idEdificio";
	    return session.createQuery(hql, Departamento.class)
	                  .setParameter("idEdificio", idEdificio)
	                  .getResultList();
	}

	/*@Override
	@Transactional
	public List<Departamento> findByEdificioId(int idEdificio) {
		    Session session = sessionFactory.getCurrentSession();
		    String hql = "FROM Departamento d WHERE d.edificio.idEdificio = :idEdificio";
		    return session.createQuery(hql, Departamento.class)
		                  .setParameter("idEdificio", idEdificio)
		                  .getResultList();
		
	}*/
	}


