package com.hcl.hibernateexercise.utility;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

public class DBHandle {
	// Insert record
	public void insertEntity(String sFirstName, String sLastName, String sEmail) {
		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Student student = new Student(sFirstName, sLastName, sEmail);
		entityManager.persist(student);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	// Select record
	public void SelectEntity(String sID) {
		String sSQL = "";

		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();

		if (sID.equals("")) {
			sSQL = "FROM Student";
		} else {
			sSQL = "FROM Student WHERE id=" + sID;
		}

		Query students = entityManager.createQuery(sSQL);

		List<Student> result = students.getResultList();

		System.out.println("------------------- Student Information -------------------");
		System.out.println("ID   First Name     Last Name		Email");

		for (Student student : result) {
			System.out.println(student.getId() + "	" + student.getFirstName() + "		" + student.getLastName()
					+ "	" + student.getEmail());
		}

		System.out.println("----------------------- End -----------------------");
		System.out.println();

		entityManager.getTransaction().commit();
		entityManager.close();
	}

	// Update record
	public void updateEntity(int iID, String sF, String sL, String sE) {
		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();

		// Update student
		Student student = entityManager.find(Student.class, iID);

		student.setFirstName(sF);
		student.setLastName(sL);
		student.setEmail(sE);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	// Remove record
	public void removeEntity(int iID) {
		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();

		Student student = entityManager.find(Student.class, iID);
		entityManager.remove(student);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
}