package com.cg.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cg.demo.entities.Product;
import com.cg.demo.repositories.CategoryRepository;
import com.cg.demo.repositories.ProductRepository;

@Service
public class ProductServcieImpl implements IProductService {

	@Autowired
	ProductRepository prodRepo;
	
	@Autowired
	CategoryRepository cateRepo;
	
	
	@Override
	public Product addProduct(Product product) {
	
		return prodRepo.save(product);
	}

	@Override
	public Product getProductDetails(int id) {
		
		return prodRepo.findOne(id);
	}
	
	@Override
	public List<Product> getByCategory(String category) {
		
		return cateRepo.findByCategory(category);
	}


	@Override
	public List<Product> getProducts() {
		return prodRepo.findAll();
	}

	@Override
	public Product updateProduct(Product product,int id) {
		Product newProduct = prodRepo.findOne(id);

		
		return prodRepo.save(newProduct);
	}

	@Override
	public void deleteProduct(int id) {
		prodRepo.delete(id);
		
		
	}

	
	}


