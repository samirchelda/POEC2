package com.m2i.formation.tests;
import static org.junit.Assert.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import org.junit.Test;

public class UnitTest {

	@Test
	public void entityManagerTest() {
		
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("FormationJPA2");
		assertNotNull(emf);
		EntityManager em =emf.createEntityManager();
		assertNotNull(em);
	}

}
