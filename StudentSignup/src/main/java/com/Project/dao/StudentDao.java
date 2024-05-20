package com.Project.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.Project.dto.Student;
import com.Project.dto.Student_Course;

public class StudentDao {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("Student_signup");
	EntityManager manager = factory.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();

	public boolean saveStudent(Student student) {
		transaction.begin();
		manager.persist(student);
		transaction.commit();
		return true;
	}

	public Student findUserByEmail(String email) {
		Query query = manager.createQuery("from Student s where email = ?1");
		query.setParameter(1, email);
		List<Student> students = query.getResultList();
		if (students.isEmpty()) {
			return null;
		}
		return students.get(0);
	}

	public Student findStudentById(int id) {
		return manager.find(Student.class, id);
	}
	public void update(Student student,Student_Course course) {
		transaction.begin();
		manager.persist(student);
		manager.persist(course);
		transaction.commit();
		return;
	}
}
