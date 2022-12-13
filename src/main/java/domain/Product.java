package domain;

import lombok.Data;

@Data
public class Product {

	private Integer id_producto;
	
	private String description;
	
	private Integer amount;

	public Product(Integer id_producto, String description, Integer amount) {
		super();
		this.id_producto = id_producto;
		this.description = description;
		this.amount = amount;
	}
	
	
}
