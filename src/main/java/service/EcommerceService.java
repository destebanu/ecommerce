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
	 * Gets a Cart for a given id
	 * 
	 * @param id
	 * @return
	 */
	public ArrayList<Product> getCart(Integer id_cart, ArrayList<Cart> carts);

	/**
	 * Adds products to a determined cart
	 * 
	 * @param products
	 */
	public ArrayList<Cart> fillCart(Integer id_cart, ArrayList<Product> products, ArrayList<Cart> carts);

	/**
	 * Deletes a cart for a given id
	 * 
	 * @param id_cart
	 */
	public ArrayList<Cart> deleteCart(Integer id_cart, ArrayList<Cart> carts);
}
