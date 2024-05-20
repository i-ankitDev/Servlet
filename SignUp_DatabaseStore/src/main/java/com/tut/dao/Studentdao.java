package com.tut.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.tut.dto.Student;

public class Studentdao {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("signup");
	EntityManager manager = factory.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();

	public boolean saveStudent(Student student) {
		transaction.begin();
		manager.persist(student);
		transaction.commit();
		return true;
	}
	public Student findStudentByEmail(String email) {
		Query query=manager.createQuery("from Student s where email = ?1");
		query.setParameter(1, email);
		List<Student> students = query.getResultList();
		if (students.isEmpty()) {
			return null;
		}
		return students.get(0);
	}
}
