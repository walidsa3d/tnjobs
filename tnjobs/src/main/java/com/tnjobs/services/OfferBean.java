package com.tnjobs.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.tnjobs.entities.Offer;

@Stateless
public class OfferBean implements OfferBeanLocal {
	@PersistenceContext
	EntityManager em;

	public OfferBean() {
	}

	public void add(Offer t) {
		em.persist(t);

	}

	public void remove(Offer t) {
		em.remove(t);

	}

	public void update(Offer t) {
		em.merge(t);

	}

	public Offer findById(int id) {
		return null;
	}

	public List<Offer> findAll() {
		return null;
	}

	public List<Offer> findNotExpired() {
		return null;
	}

}
