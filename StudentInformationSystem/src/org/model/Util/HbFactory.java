package org.model.Util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HbFactory {
	private static final SessionFactory sessionFactory;

	static {
		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
	public static SessionFactory get() {
		return sessionFactory;
	}
}
