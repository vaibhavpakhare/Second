package com.scoe.java.ScoeHibernateFirst;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestHib {
	public static void main(String[] args) {
		Student s1 = new Student(1, "Vaibhav", "Kolhapur");
		Student s2 = new Student(2, "Omkar", "Sangali");

		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session se = sf.openSession();
		Transaction tr = se.beginTransaction();
		se.save(s1);
		se.save(s2);
		System.out.println("saved succesfullyy..........................");

		Student m10 = (Student) se.get(Student.class, 1);
		Student m11 = (Student) se.get(Student.class, 1);
		System.out.println(m10);
		se.flush();
		tr.commit();
		se.close();

	}

}
