package service;

import java.util.ArrayList;

import domain.Cart;
import domain.Product;

/**
 * Interface with the methods with the business logic related to the Cart
 * entity.
 * 
 * @author danie
 *
 */
public interface EcommerceService {

	/**
	 * Creates a new cart
	 * 
	 * @return
	 */
	public Cart createCart(Integer id);

	/**
	 * Obtains information of a cart given its id
	 * 
	 * @param id
	 * @return
	 */
	public String[] getCartInfo(Integer id_cart);

	/**
	 * Adds products to a determined cart
	 * 
	 * @param products
	 */
	public void fillCart(Integer id_cart, ArrayList<Product> products);

	/**
	 * Deletes a cart given its id
	 * 
	 * @param id_cart
	 */
	public void eraseCart(Integer id_cart);
}
