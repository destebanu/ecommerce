package com.ecommerce.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.domain.Cart;
import com.ecommerce.domain.Product;
import com.ecommerce.service.EcommerceService;

@RestController
@RequestMapping(value = "/ecommerce")
public class EcommerceController {

	// Carts id variable
	private static Integer id_cart = 0;

	// List with carts created
	private static ArrayList<Cart> carts = new ArrayList<Cart>();

	@Autowired
	private EcommerceService ecommerceService;
	
	/**
	 * The carts will reset every 10 minutes
	 */
	@Scheduled (cron = "0 0/10 * * * *")
	public void cartTTL() {
		this.carts = new ArrayList<Cart>();
		this.id_cart = 0;
		System.out.println("The carts have been reset.");
	}

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
	@GetMapping(value = "/getcart/{id_cart}")
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
	@PutMapping(value = "/deletecart/{id_cart}")
	public void deleteCart(@PathVariable Integer id_cart) {
		this.carts = ecommerceService.deleteCart(id_cart, carts);

	}
}
