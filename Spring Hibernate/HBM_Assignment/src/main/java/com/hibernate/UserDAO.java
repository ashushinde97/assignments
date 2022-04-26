package com.hibernate;

import org.hibernate.Criteria;
import org.hibernate.Session;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;

import com.hibernate.User;



public class UserDAO {

	HibernateTransactionManager hbmtemplate;

	public void setHbmtemplate(HibernateTransactionManager hbmtemplate) {
		this.hbmtemplate = hbmtemplate;
	}
	
	
	public void saveUser(User e)
	{	
		  SessionFactory sf= hbmtemplate.getSessionFactory();
		  Session objSession = sf.openSession();
		  Transaction t = objSession.beginTransaction();
		  
		  objSession.save(e);
		  
		  t.commit();
		  System.out.println("Record saved");
		  objSession.close();		  
	}
	
	
	public void updateUser(User e)
	{
		  SessionFactory sf= hbmtemplate.getSessionFactory();
		  Session objSession = sf.openSession();
		  Transaction t = objSession.beginTransaction();
		  objSession.update(e);
		  
		  t.commit();
		 System.out.println("Data updated");
	}
	
	
	
	public List<User> getUserByFirstname(String f)
	{
		SessionFactory sf= hbmtemplate.getSessionFactory();
		Session objSession = sf.openSession();
		Transaction t = objSession.beginTransaction();
		List<User> ulist = new ArrayList<User>();
		Criteria ct = objSession.createCriteria(User.class, f);
		ulist = ct.list();
		return ulist;		
	}
	
	public List<User> getUser()
	{
		SessionFactory sf= hbmtemplate.getSessionFactory();
		Session objSession = sf.openSession();
		Transaction t = objSession.beginTransaction();
		List<User> emplist = new ArrayList<User>();
		Criteria ctr = objSession.createCriteria(User.class);
		emplist = ctr.list();
		return emplist;
		
	}
	
	
	
}
