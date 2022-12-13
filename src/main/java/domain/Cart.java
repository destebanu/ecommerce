package domain;

import java.util.ArrayList;

import lombok.Data;

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


