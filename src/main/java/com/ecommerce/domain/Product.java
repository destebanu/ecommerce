package com.ecommerce.domain;

import lombok.Data;

/**
 * The Product entity class
 * 
 * @author danie
 *
 */
@Data
public class Product {

	private Integer id_product;
	
	private String description;
	
	private Integer amount;

	public Product(Integer id_product, String description, Integer amount) {
		super();
		this.id_product = id_product;
		this.description = description;
		this.amount = amount;
	}
	
	
}
