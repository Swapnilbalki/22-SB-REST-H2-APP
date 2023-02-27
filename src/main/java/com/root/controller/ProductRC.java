package com.root.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.root.dao.ProductRepo;
import com.root.entity.Product;

@RestController
public class ProductRC {

	@Autowired
	private ProductRepo productrepo;
	
	@PostMapping(value = "/saveProduct", produces = "application/json")
	public ResponseEntity<String> saveProduct(@RequestBody Product  product)
	{
		productrepo.save(product);
		String msg = "Product saved successfully";
		return new ResponseEntity<String>(msg, HttpStatus.CREATED);
	}
	
	@GetMapping("/getProduct")
	public ResponseEntity<List<Product>> getProduct()
	{
		List<Product> products = productrepo.findAll();
		return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
	}
	
}
