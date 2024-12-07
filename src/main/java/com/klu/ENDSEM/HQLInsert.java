package com.klu.ENDSEM;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HQLInsert {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session s = sf.openSession();
		
		org.hibernate.Transaction t = s.beginTransaction();
		Query q = s.createSQLQuery("insert into Student(id,name,location,hodname) values(22,'ASDF','delhi','dharmamam')");
		q.executeUpdate();
		System.out.println("Inserted");
		
	}

}
