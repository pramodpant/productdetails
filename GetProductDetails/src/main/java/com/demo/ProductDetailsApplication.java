package com.demo;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.demo.product.beans.ProductTechnicalSpecification;
import com.demo.product.service.ProductService;

@SpringBootApplication
@RestController
@RequestMapping("/products")
public class ProductDetailsApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ProductDetailsApplication.class, args);
	}
	
	@Autowired	
	ProductService productServiceImplementation;
	 
	 
	 @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, value="/submit")
	    public void create(@RequestBody ProductTechnicalSpecification product) {
		 productServiceImplementation.create(product);
	    }
	
	 
	 @RequestMapping(method=RequestMethod.GET, value="/show/{id}")
	    public Optional<ProductTechnicalSpecification> getProductDetails(@PathVariable String id) {
	        return productServiceImplementation.findById(id);
	    }
	 
	 	@ExceptionHandler
	    @ResponseStatus(HttpStatus.NOT_FOUND)
	    public void handleTodoNotFound(Exception ex) {
	       System.out.println(ex.getMessage());
	}
}