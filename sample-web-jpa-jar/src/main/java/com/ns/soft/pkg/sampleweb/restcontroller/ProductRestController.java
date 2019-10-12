package com.ns.soft.pkg.sampleweb.restcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ns.soft.pkg.sampleweb.model.Product;

@RestController
public class ProductRestController {
	private static List<Product> products = new ArrayList<>();

	@RequestMapping("/products")
	public List<Product> getProducts() {
		Product product = new Product("1", "Honey");
		Product product2 = new Product("2", "Almond");
		if (products.isEmpty()) {
			products.add(product);
			products.add(product2);
		}
		return products;
	}

	@RequestMapping(value = "/products", method = RequestMethod.POST)
	public List<Product> addProducts(@RequestBody Product product) {
		products.add(product);
		return products;
	}
}
