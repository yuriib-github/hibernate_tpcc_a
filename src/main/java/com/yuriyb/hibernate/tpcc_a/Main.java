package com.yuriyb.hibernate.tpcc_a;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Main {

	public static void main(String[] args) {
		
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		Session session = cfg.configure("hibernate.cfg.xml")
				.buildSessionFactory().openSession();

		Transaction t = session.beginTransaction();

		Employee e1 = new Employee();
		e1.setName("Yuriy Gagarin");

		RegularEmployee e2 = new RegularEmployee();
		e2.setName("Tom Hanks");
		e2.setSalary(40000);
		e2.setBonus(4);

		ContractEmployee e3 = new ContractEmployee();
		e3.setName("Bruce Willis");
		e3.setHourlyPay(1000);
		e3.setContractDuration("12 months");

		session.persist(e1);
		session.persist(e2);
		session.persist(e3);

		t.commit();
		session.close();
		System.out.println("success");
	}
}
