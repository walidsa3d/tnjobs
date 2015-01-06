package com.tnjobs.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.tnjobs.entities.User;

@Stateless
public class UserBean implements UserBeanLocal {
	@PersistenceContext
	EntityManager em;

	public UserBean() {
	}

	public void add(User t) {

	}

	public void remove(User t) {

	}

	public void update(User t) {

	}

	public User findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
