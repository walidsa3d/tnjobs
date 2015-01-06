package com.tnjobs.services;

import javax.ejb.Local;

import com.tnjobs.entities.User;

@Local
public interface UserBeanLocal extends JPACrud<User> {

}
