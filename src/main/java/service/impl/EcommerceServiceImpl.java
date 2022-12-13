package service.impl;

import java.util.ArrayList;

import domain.Cart;
import domain.Product;
import service.EcommerceService;

/**
 * Service that implements the EcommerceService interface
 * 
 * @author danie
 *
 */
public class EcommerceServiceImpl implements EcommerceService {

	/**
	 * Creates a new cart
	 * 
	 * @return
	 */
	public Cart createCart(Integer id) {

		ArrayList<Product> products = new ArrayList<Product>();
		Cart cart = new Cart(id, products);

		return cart;
	}

	/**
	 * Gets a Cart for a given id
	 * 
	 * @param id
	 * @return
	 */
	@Override
	public ArrayList<Product> getCart(Integer id_cart, ArrayList<Cart> carts) {

		ArrayList<Product> productList = new ArrayList<Product>();
		for (Cart c : carts)
			productList = (c.getId_cart().equals(id_cart)) ? c.getProducts() : new ArrayList<Product>();

		return productList;
	}

	/**
	 * Adds products to a determined cart
	 * 
	 * @param products
	 */
	@Override
	public void fillCart(Integer id_cart, ArrayList<Product> products) {
		// TODO Auto-generated method stub

	}

	/**
	 * Deletes a cart for a given id
	 * 
	 * @param id_cart
	 */
	@Override
	public ArrayList<Cart> deleteCart(Integer id_cart, ArrayList<Cart> carts) {

		for (int i = 0; i < carts.size(); i++)
			if (carts.get(i).getId_cart().equals(id_cart))
				carts.remove(i);

		return carts;
	}

}
