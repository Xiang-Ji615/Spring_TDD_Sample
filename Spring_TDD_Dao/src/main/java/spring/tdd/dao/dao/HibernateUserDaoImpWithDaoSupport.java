package main.java.spring.tdd.dao.dao;

import java.util.List;import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import main.java.spring.tdd.dao.model.User;


public class HibernateUserDaoImpWithDaoSupport extends HibernateDaoSupport implements IUserDao{

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public List<User> listUser() {
		// TODO Auto-generated method stub
		List<User> ret = (List<User>) getHibernateTemplate().find("from User");
		return ret;
	}

	@Override
	public Boolean saveUser(User user) {
		// TODO Auto-generated method stub
		getHibernateTemplate().persist(user);
		return true;
	}

	@Override
	public List<User> listUserWithSQL() {
		// TODO Auto-generated method stub
		List<User> ret = getHibernateTemplate().getSessionFactory().getCurrentSession().createSQLQuery("Select * from user").list();
		return ret;
	}

}
