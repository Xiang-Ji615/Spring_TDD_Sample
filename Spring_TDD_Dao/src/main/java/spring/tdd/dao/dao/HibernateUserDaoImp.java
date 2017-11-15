package main.java.spring.tdd.dao.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import main.java.spring.tdd.dao.model.User;

@Repository
public class HibernateUserDaoImp implements IUserDao {
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public List<User> listUser() {
		Session session = null;
		Transaction tx = null;
		List<User> ret = new ArrayList<User>();
		try {
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			tx.setTimeout(5);
			Query query = session.createQuery("from User");
			ret = query.list();
			tx.commit();

		} catch (RuntimeException e) {
			try {
				tx.rollback();
			} catch (RuntimeException rbe) {
				System.out.println("Couldn’t roll back transaction : " + rbe);
			}
		} finally {
			if (session != null) {
				session.close();

			}
		}
		return ret;
	}

	@Override
	public Boolean saveUser(User user) {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction tx = null;

		try {
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			tx.setTimeout(5);
			session.saveOrUpdate(user);
			tx.commit();

		} catch (RuntimeException e) {
			try {
				tx.rollback();
			} catch (RuntimeException rbe) {
				System.out.println("Couldn’t roll back transaction : " + rbe);
			}
		} finally {
			if (session != null) {
				session.close();

			}
		}
		return true;
	}

	@Override
	public List<User> listUserWithSQL() {
		// TODO Auto-generated method stub
		return null;
	}

}
