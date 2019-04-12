package com.cg.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.demo.entities.Product;

@Repository
public interface CategoryRepository extends JpaRepository<Product,Integer>{
	
	/* @Query(nativeQuery = true, value = "SELECT * FROM Product WHERE category = :category ;")
	 List<Product> getProductCategory(@Param("category") String category); */
	 
	 List<Product> findByCategory( String category); 
	
	

}
