package com.cg.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.demo.entities.Product;
import com.cg.demo.services.IProductService;

@RestController
public class ProductController {
	
	@Autowired
	IProductService productService;
	
	@RequestMapping(value="/product", method=RequestMethod.POST)
	public Product addProduct(@RequestBody Product product) {
		
		return productService.addProduct(product);
	}
	
	@RequestMapping(value="/product/{id}",method=RequestMethod.GET)
	public Product getProductDetails(@PathVariable int id){
		
		return productService.getProductDetails(id);
	}
	
	@RequestMapping(value="/products/{category}",method=RequestMethod.GET)
	public List<Product> getByCategory(@PathVariable String category){
		
		return productService.getByCategory(category);
		
	}
	
	@RequestMapping(value="/products",method=RequestMethod.GET)
	public List<Product> getProducts(){
		
		return productService.getProducts();
		
	}
	
	@RequestMapping(value="/product/{id}",method=RequestMethod.PUT)
	public Product updateProduct(@RequestBody Product product,@PathVariable int id){
		
		return productService.updateProduct(product,id);
	}
	
	@RequestMapping(value="/product/{id}",method=RequestMethod.DELETE)
	public void deleteProduct(@PathVariable int id){
		
		productService.deleteProduct(id);
		
	}
	

	
		
	}


