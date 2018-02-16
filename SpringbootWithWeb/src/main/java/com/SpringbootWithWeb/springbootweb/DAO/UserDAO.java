package com.SpringbootWithWeb.springbootweb.DAO;

import java.util.List;

import com.SpringbootWithWeb.springbootweb.model.User;

public interface UserDAO {
	public List<User> findAll();
	public boolean findIfUserExists(User user);
	public Integer findUser(User user);
	public void insertNew(User user);
}
