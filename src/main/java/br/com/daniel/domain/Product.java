package br.com.daniel.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_PRODUCTS")
public class Product {
	
//	Properties
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_generetor_id")
	@SequenceGenerator(name = "product_generetor_id", sequenceName = "sq_product_id", initialValue = 1, allocationSize = 1)
	private Long id;
	
	@Column(name = "product_name")
	private String productName;
	
	@Column(name = "price")
	private Double price;

//	Getters and Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price)  {
		this.price = price;
	}
}
