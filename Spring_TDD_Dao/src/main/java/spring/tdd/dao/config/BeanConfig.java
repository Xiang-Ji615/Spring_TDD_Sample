package main.java.spring.tdd.dao.config;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import main.java.spring.tdd.dao.dao.HibernateUserDaoImpWithDaoSupport;
import main.java.spring.tdd.dao.dao.IUserDao;

@Configuration
public class BeanConfig {

	@Autowired
	SessionFactory sessionFactory;
	
//	@Bean(name= {"hibernateUserDaoImpWithDaoSupport"})
//	public IUserDao getDaoSupportDao() {
//		HibernateUserDaoImpWithDaoSupport dao = new HibernateUserDaoImpWithDaoSupport();
//		dao.setSessionFactory(sessionFactory);
//		return dao;
//	}
}
