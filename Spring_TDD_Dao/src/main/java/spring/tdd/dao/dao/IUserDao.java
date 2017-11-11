package main.java.spring.tdd.dao.dao;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import main.java.spring.tdd.dao.model.User;

public interface IUserDao {

	List<User> listUser();
	
	Boolean saveUser(User user);
}
