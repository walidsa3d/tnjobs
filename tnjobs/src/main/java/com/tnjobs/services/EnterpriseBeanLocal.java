package com.tnjobs.services;

import javax.ejb.Local;

import com.tnjobs.entities.Enterprise;

@Local
public interface EnterpriseBeanLocal extends JPACrud<Enterprise> {

}
