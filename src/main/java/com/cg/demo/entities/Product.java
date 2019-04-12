package com.cg.demo.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
//@Table(name = "PRODUCT")
//@Getter
//@Setter
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	//@Column(name = "ID", updatable = false, nullable = false)
	private int id;
	
	//@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	   // @JoinColumn(name = "CATEGORY") 	
		private String category;	
		
		//@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
		//@Column(name = "PROPERTY", nullable = false)
		private String name;
		
		private String price;
		
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}


	
		
}
