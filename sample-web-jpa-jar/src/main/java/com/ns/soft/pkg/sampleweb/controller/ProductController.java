package com.ns.soft.pkg.sampleweb.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ns.soft.pkg.sampleweb.model.Product;

@Controller
public class ProductController {

	@RequestMapping("/view-products")
	public String viewProducts() {
		return "view-products";
	}

	@RequestMapping("/add-products")
	public String addProducts() {
		return "add-products";
	}

}
