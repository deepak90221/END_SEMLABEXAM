package com.klu.ENDSEM;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HQLDel {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session s = sf.openSession();
		
		org.hibernate.Transaction t = s.beginTransaction();
		
		Query q = s.createQuery("DELETE Student  where sid =41");
		
		q.executeUpdate();
		
		System.out.print("Record Updated Successfully");
		
	}

}


