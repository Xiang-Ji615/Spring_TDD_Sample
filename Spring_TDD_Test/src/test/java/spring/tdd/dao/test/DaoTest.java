package test.java.spring.tdd.dao.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import main.java.spring.tdd.dao.config.DaoConfig;
import main.java.spring.tdd.dao.dao.IUserDao;
import main.java.spring.tdd.dao.model.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {DaoConfig.class})
@Transactional
public class DaoTest {
	
	@Autowired
	@Qualifier(value="hibernateUserDaoImpWithDaoSupport")
	IUserDao userDao;
	
	@Autowired
	HibernateTransactionManager trManager;
	
	@Test
	public void test1() throws Exception {
		User user = new User();
		user.setUsername("TSTUser");
		user.setPassword("TSTPassword");
		userDao.saveUser(user);
//		if(true)
//		throw new Exception("JJ e");
		assertNotNull(userDao.listUser());
	}
}
