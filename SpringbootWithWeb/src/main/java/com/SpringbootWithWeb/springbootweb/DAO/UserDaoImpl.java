package com.SpringbootWithWeb.springbootweb.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.SpringbootWithWeb.springbootweb.model.User;

@Repository
public class UserDaoImpl implements UserDAO {
	
	@PersistenceContext
	EntityManager entityManager;
	
	@Autowired
	JdbcTemplate jdbcTemplete;
	
	public List<User> findAll(){
		TypedQuery<User> query = entityManager.createNamedQuery("queryAll",User.class);
		return query.getResultList();
	}
	
	public boolean findIfUserExists(User user) {
		//return jdbcTemplete.queryForObject("Select count(*) from user where user_id=? ", new Object[] {user.getUserId()}, Integer.class);
//		return entityManager.mer;
		return entityManager.find(User.class, user.getUserId()).getFirstName().isEmpty();
	}
	
	public Integer findUser(User user) {
//		return jdbcTemplete.queryForObject("Select count(*) from user where user_id=? and password=?", new Object[] {userId, password}, Integer.class);
		return entityManager.createNamedQuery("queryOneUser").setParameter("uid", user.getUserId()).setParameter("pwd", user.getPassword()).getResultList().size();
	}

	public void insertNew(User user){
//		return jdbcTemplete.update("insert into user values ( ?, ? , ? , ? , ?)", new Object[] { user.getUserId(), user.getEmail(), user.getFirstName(), user.getLastName(),  user.getPassword()});
		entityManager.persist(user);
	}
}
