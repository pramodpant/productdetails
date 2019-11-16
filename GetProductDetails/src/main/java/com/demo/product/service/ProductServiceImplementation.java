package com.demo.product.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.product.beans.ProductTechnicalSpecification;
import com.demo.product.repo.ProductRepository;

@Service
public class ProductServiceImplementation implements ProductService{

	 private final ProductRepository productRepository;
	 
	 @Autowired
	 ProductServiceImplementation(ProductRepository productRepository) {
	        this.productRepository = productRepository;
	   }
	 
	@Override
	public void create(ProductTechnicalSpecification product) {
		// TODO Auto-generated method stub
		productRepository.save(product);
		
	}

	@Override
	public Optional<ProductTechnicalSpecification> findById(String id) {
		// TODO Auto-generated method stub
		return productRepository.findById(id);
	}

}
