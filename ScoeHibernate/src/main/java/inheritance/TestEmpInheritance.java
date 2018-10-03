package inheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestEmpInheritance {
	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.setId(100);
		e1.setName("Vaibhav pakhare");

		Regular_Employee e2 = new Regular_Employee();
		e2.setId(101);
		e2.setName("Sachin jadhav");
		e2.setSalary(50000);
		e2.setBonus(5);

		Contract_Employee e3 = new Contract_Employee();
		e3.setId(102);
		e3.setName("kedar bhuimbar");
		e3.setPay_per_hour(1000);
		e3.setContract_duration("15 hours");

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session se = sf.openSession();
		Transaction tr = se.beginTransaction();

		se.save(e1);
		se.save(e2);
		se.save(e3);
		tr.commit();
		se.close();
		System.out.println("success");

	}

}
