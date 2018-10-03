package com.scp.java.VaibhavHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FirstLevel {

	SessionFactory sf = new Configuration().configure().buildSessionFactory();
	Session se = sf.openSession();

	Transaction tr = se.beginTransaction();

}
