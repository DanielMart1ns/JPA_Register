package br.com.daniel.product.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.daniel.dao.IProductDAO;
import br.com.daniel.dao.ProductDAO;
import br.com.daniel.domain.Product;

public class ProductTest {
	
	private IProductDAO dao;
	
	public ProductTest() {
		dao = new ProductDAO();
	}
	
	@Test
	public void registerProduct() {
		Product product = new Product();
		product.setProductName("Chocolate bar");
		product.setPrice(4.90D);
		
		product = dao.register(product);
		
		assertNotNull(product);
		assertNotNull(product.getId());
	}
}
