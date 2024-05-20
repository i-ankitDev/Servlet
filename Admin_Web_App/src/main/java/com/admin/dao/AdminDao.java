package com.admin.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.admin.dto.UserDetails;

public class AdminDao {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("admin");
	EntityManager manager = factory.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();

	public void saveDetails(UserDetails details) {
		transaction.begin();
		manager.persist(details);
		transaction.commit();
	}

	public List<UserDetails> findAll() {
		return manager.createQuery("from UserDetails ud order by id").getResultList();
	}

	public UserDetails findDetailsByID(int id) {
		return manager.find(UserDetails.class, id);
	}

	public void updateDetails(UserDetails userDetails) {
		transaction.begin();
		manager.merge(userDetails);
		transaction.commit();
	}

	public void delete(UserDetails userDetails) {
		transaction.begin();
		manager.remove(userDetails);
		transaction.commit();
	}
}
