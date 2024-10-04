package br.com.daniel.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.daniel.domain.Product;

public class ProductDAO implements IProductDAO{

	@Override
	public Product register(Product prod) {
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("RegisterPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(prod);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
		
		return prod;
	}
	
}
