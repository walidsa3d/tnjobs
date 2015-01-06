package com.tnjobs.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.tnjobs.entities.Enterprise;

@Stateless
public class EnterpriseBean implements EnterpriseBeanLocal {
	@PersistenceContext
	EntityManager em;

	public EnterpriseBean() {
	}

	public void add(Enterprise t) {
		em.persist(t);

	}

	public void remove(Enterprise t) {
		em.remove(t);

	}

	public void update(Enterprise t) {
		em.merge(t);

	}

	public Enterprise findById(int id) {
		return null;
	}

	public List<Enterprise> findAll() {
		return null;
	}

}
