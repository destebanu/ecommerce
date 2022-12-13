package com.ecommerce.domain;

import java.util.ArrayList;

import lombok.Data;

/**
 * The Cart entity class
 * 
 * @author danie
 *
 */
@Data
public class Cart {

	private Integer id_cart;

	private ArrayList<Product> products;

	public Cart(Integer id_cart, ArrayList<Product> products) {
		super();
		this.id_cart = id_cart;
		this.products = products;
	}

}
