package main.java.spring.tdd.bo.bo;

import java.util.concurrent.TimeoutException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import main.java.spring.tdd.dao.dao.IUserDao;
import main.java.spring.tdd.dao.model.User;

@Component
public class UserBoImp implements IUserBo {

	@Autowired
	@Qualifier(value = "hibernateUserDaoImpWithDaoSupport")
	IUserDao userDao;

	@Override
	@Transactional(transactionManager="hibernateTransactionManager", rollbackFor= {TimeoutException.class})
	public void sampleRule() throws TimeoutException {
		// TODO Auto-generated method stub
		User user = new User();
		user.setUsername("TSTUser");
		user.setPassword("TSTPassword");
		userDao.saveUser(user);
		if(true)
		throw new TimeoutException("JJ e");
		userDao.listUser();
	}

}
