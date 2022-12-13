package controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import domain.Cart;
import domain.Product;
import service.EcommerceService;

@RestController
@RequestMapping(value = "/ecommerce")
public class EcommerceController {

	// Carts id variable
	private Integer id_cart = 0;
	
	// List with carts created
	private ArrayList<Cart> carts = new ArrayList<Cart>();

	@Autowired
	private EcommerceService ecommerceService;

	/**
	 * Creates a new Cart
	 * 
	 * @return
	 */
	@PostMapping(value = "/createcart")
	public Cart createCart() {
		this.id_cart++;
		Cart cart = ecommerceService.createCart(id_cart);
		carts.add(cart);
		return cart;
	}

	/**
	 * Gets a Cart for a given id
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping(value = "/getcart/{id}")
	public ArrayList<Product> getCart(@PathVariable Integer id_cart) {
		return ecommerceService.getCart(id_cart, carts);
	}

	/**
	 * Adds products to the present cart
	 * 
	 * @param id_cart
	 * @param products
	 */
	@PostMapping(value = "/fillcart", consumes = { "application/json" })
	public void fillCart(@RequestBody ArrayList<Product> products) {
		this.carts = ecommerceService.fillCart(id_cart, products, carts);
	}

	/**
	 * Deletes a cart for a given id
	 * 
	 * @param id_cart
	 */
	@PutMapping(value = "/deletecart/{id}")
	public void deleteCart(@PathVariable Integer id_cart) {
		this.carts = ecommerceService.deleteCart(id_cart, carts);

	}
}
