package com.SpringbootWithWeb.springbootweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringbootWithWeb.springbootweb.DAO.UserDaoImpl;
import com.SpringbootWithWeb.springbootweb.model.User;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	UserDaoImpl userDao;
	
	@Override
	public int validUser(User user) {
		if(userDao.findIfUserExists(user) == true) {
			if((userDao.findUser(user))==1) {
				return 1;
			}
			else
				return 2;
		}
		return 0;
	}	
}
