package main.java.spring.tdd.dao.dao;

import java.util.List;

import main.java.spring.tdd.dao.model.User;

public interface IUserDao {

	List<User> listUser();
	
	Boolean saveUser(User user);
	
	List<User> listUserWithSQL();
}
