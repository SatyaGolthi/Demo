package com.cg.demo.services;

import java.util.List;

import com.cg.demo.entities.Product;

public interface IProductService {

 public	Product addProduct(Product product);
 
 public Product getProductDetails(int id);
 
 public List<Product> getByCategory(String category);

 public List<Product> getProducts();

public Product updateProduct(Product product,int id);

public void deleteProduct(int id);



}
