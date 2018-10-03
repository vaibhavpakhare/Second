package com.scp.java.VaibhavHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestHibernate {

	public static void main(String[] args) {
		Mobile m1 = new Mobile(1, "Sony", 15000);
		Mobile m2 = new Mobile(2, "LG", 15000);
		Mobile m3 = new Mobile(3, "Mi", 11000);
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session se = sf.openSession();

		Transaction tr = se.beginTransaction();
		// se.save(m1);
		// se.save(m2);
		// se.save(m3);

		System.out.println("saved succesfullyy..........................");

		se.flush();
		tr.commit();
		System.out.println(se.get(Mobile.class, 1));
		System.out.println(se.get(Mobile.class, 1));

		// System.out.println(m11);
		se.close();
		// System.out.println(((Session) sf).get(Mobile.class, 1));
	}

}
