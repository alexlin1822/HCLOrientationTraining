package com.hcl.hibernateexercise.utility;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	private static EntityManagerFactory factory;
	private static final String PERSISTENCE_UNIT_NAME = "PERSISTENCE";

	public static EntityManagerFactory getEntityManagerFactory() {
		if (factory == null) {
			factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		}
		return factory;
	}

	public static void shutdown() {
		if (factory != null) {
			factory.close();
		}
	}
}
