package com.scoe.java.ScoeHibernateFirst;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SecondLevel {
	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session se = sf.openSession();
		Transaction tr = se.beginTransaction();

		Student s1 = (Student) se.get(Student.class, 1);
		Student s2 = (Student) se.get(Student.class, 1);
		System.out.println(s2);
		tr.commit();
		se.close();
		Session se1 = sf.openSession();

		Student s3 = (Student) se1.get(Student.class, 1);
		Student s4 = (Student) se1.get(Student.class, 1);
		Student s5 = (Student) se1.get(Student.class, 1);
		System.out.println(s5);

	}

}
