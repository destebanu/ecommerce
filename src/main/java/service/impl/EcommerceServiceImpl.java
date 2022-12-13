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
		ArrayList<Product> products = new ArrayList();
		Cart cart = new Cart(id, products);

		return cart;
	}

	/**
	 * Obtains information of a cart given its id
	 * 
	 * @param id
	 * @return
	 */
	@Override
	public String[] getCartInfo(Integer id_cart) {
		// TODO Auto-generated method stub
		return null;
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
	 * Deletes a cart given its id
	 * 
	 * @param id_cart
	 */
	@Override
	public void eraseCart(Integer id_cart) {
		// TODO Auto-generated method stub

	}

}
