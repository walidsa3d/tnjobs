package com.tnjobs.services;

import java.util.List;

public interface JPACrud<T> {
	public void add(T t);
	public void remove(T t);
	public void update(T t);
	public T findById(int id);
	public List<T> findAll();
	

}
