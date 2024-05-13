package com.springrest.springrest.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;


import com.springrest.springrest.entities.Category;
import com.springrest.springrest.entities.Product;
import com.springrest.springrest.service.CategoryService;
import com.springrest.springrest.service.ProductService;



@RestController
public class Controller {
	
	
	@Autowired
	private CategoryService categoryservice;
	
	
	
	//GET THE Categories
	    @GetMapping("/api/categories")
		public List<Category>getCategory(){
			
			return this.categoryservice.getCategory();
			
			}
		
		//Getting single category
		@GetMapping("/api/categories/{catId}")
		public Category getCategory(@PathVariable String catId) {
			
		return this.categoryservice.getCategory(Long.parseLong(catId));
			
		}
		//Adding category
		@PostMapping("/api/categories")
		public Category addCategory(@RequestBody Category cat) {
			
			return this.categoryservice.addCategory(cat);
		}
		//updating category
		@PutMapping("/api/categories/{catId}")
		public Category updatcatCategory(@RequestBody Category cat) {
				
				return this.categoryservice.UpdateCategory(cat);
		}
		
		//delete category
		@DeleteMapping("/api/categories/{catId}")
		public ResponseEntity<HttpStatus> deleteCategory(@PathVariable String catId){
			try {
				this.categoryservice.deleteCategory(Long.parseLong(catId));
				return new ResponseEntity<>(HttpStatus.OK);
			}catch( Exception e) {
			return  new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
			
		}
		
		
		
		
		////////////// Product Controller //////////////////////////////////
		
		@Autowired
		private ProductService productservice;
		
		
		
		//GET The all products
		    @GetMapping("/api/products")
			public List<Product>getProduct(){
				
				return this.productservice.getProduct();
				
				}
			
			//Getting single Product
			@GetMapping("/api/products/{ProdId}")
			public Product getProduct(@PathVariable String ProdId) {
				
			return this.productservice.getProduct(Long.parseLong(ProdId));
				
			}
			//Adding Product
			
			
			@PostMapping("/api/products")
			public Product addProduct(@RequestBody Product product) {
				
				return this.productservice.addProduct(product);
			}
			//updating product
			@PutMapping("/api/products/{ProdId}")
			public Product updateProduct(@RequestBody Product product) {
					
					return this.productservice.UpdateProduct(product);
			}
			
			//delete product
			@DeleteMapping("/api/products/{ProdId}")
			public ResponseEntity<HttpStatus> deleteProduct(@PathVariable String ProdId){
				try {
					this.productservice.deleteProduct(Long.parseLong(ProdId));
					return new ResponseEntity<>(HttpStatus.OK);
				}catch( Exception e) {
				return  new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
				}
				
			}
			
			
		}

	
		
			
		
	
	
	

