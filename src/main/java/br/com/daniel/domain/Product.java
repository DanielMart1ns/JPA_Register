package br.com.daniel.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_generetor_id")
	@SequenceGenerator(name = "product_generetor_id", sequenceName = "sq_product_id")
	private Long id;
	
	private String nome;
	
	private Long preco;
}
