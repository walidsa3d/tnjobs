package com.tnjobs.services;

import java.util.List;

import javax.ejb.Local;

import com.tnjobs.entities.Offer;

@Local
public interface OfferBeanLocal extends JPACrud<Offer> {
	public List<Offer> findNotExpired();

}
