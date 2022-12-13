package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import domain.Cart;
import service.EcommerceService;

@RestController
@RequestMapping(value = "/ecommerce")
public class EcommerceController {
	
	private static Integer id = 0;
	
	@Autowired
	private EcommerceService ecommerceService;

	@PostMapping(value = "/create-cart")
	public Cart createCart() {
		id++;
		return ecommerceService.createCart(id);
	}
}
