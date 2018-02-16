package com.SpringbootWithWeb.springbootweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringbootWithWeb.springbootweb.DAO.UserDaoImpl;
import com.SpringbootWithWeb.springbootweb.model.User;

@Service
public class RegistrationServiceImpl implements RegistrationService {
	@Autowired
	UserDaoImpl userDao;
	
	public boolean registerUser(User user) {
		if(userDao.findIfUserExists(user) != true) 
			{	userDao.insertNew(user); 
				return true;
			}
		return false;
	}
}
