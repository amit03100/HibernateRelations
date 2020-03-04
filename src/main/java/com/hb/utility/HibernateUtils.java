package com.hb.utility;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	private static SessionFactory factory;

	static {
		Configuration config = null;

		try {
			config = new Configuration().configure("com/hb/config/hibernate.cfg.xml");
			factory = config.buildSessionFactory();
		} catch (HibernateException h) {
			h.printStackTrace();
		}

	}

	public static SessionFactory getSessionFactory() {
		return factory;
	}

	public static void closeSessionFactory() {
		if (factory != null) {
			factory.close();
		}
	}

	public static Session getSession() {
		Session localSession = null;

		if (factory != null) {
			localSession = factory.openSession();
		}

		return localSession;
	}

	public static void closeSession(Session sessionArg) {
		if (sessionArg != null) {
			sessionArg.close();
		}
	}
}
