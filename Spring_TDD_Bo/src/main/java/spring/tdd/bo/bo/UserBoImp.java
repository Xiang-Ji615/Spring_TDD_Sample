package main.java.spring.tdd.bo.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import main.java.spring.tdd.dao.dao.IUserDao;
import main.java.spring.tdd.dao.model.User;

@Component
public class UserBoImp implements IUserBo {

	@Autowired
	@Qualifier(value = "hibernateUserDaoImp")
	IUserDao userDao;

	@Override
	public void sampleRule() throws Exception {
		// TODO Auto-generated method stub
		User user = new User();
		user.setUsername("TSTUser");
		user.setPassword("TSTPassword");
		userDao.saveUser(user);
		if (true)
			throw new Exception("JJ e");
		userDao.listUser();
	}

}
