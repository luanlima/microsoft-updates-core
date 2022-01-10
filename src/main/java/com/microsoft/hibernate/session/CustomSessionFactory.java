package com.microsoft.hibernate.session;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CustomSessionFactory {
    private static final SessionFactory SESSION_FACTORY;

    static {
	try {
	    SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	    SESSION_FACTORY = sessionFactory;
	} catch (Exception e) {
	    System.err.println("Initial SessionFactory creation failed." + e);
	    throw new ExceptionInInitializerError(e);
	}
    }

    public static SessionFactory getSessionFactory() {
	return SESSION_FACTORY;
    }

    public static Session getSession() {
	return getSessionFactory().openSession();
    }
}