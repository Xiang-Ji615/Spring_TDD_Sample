package main.java.spring.tdd.dao.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

import main.java.spring.tdd.dao.model.User;

public interface IUserDao {

	List<User> listUser();
	
	Boolean saveUser(User user);
	
	List<User> listUserWithSQL();
	
//	@Lookup(value="user")
	public abstract User getUserBean();
}
