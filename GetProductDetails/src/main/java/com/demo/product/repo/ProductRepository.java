package com.demo.product.repo;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.demo.product.beans.ProductTechnicalSpecification;


public interface ProductRepository extends MongoRepository<ProductTechnicalSpecification, String> {
   
	@Override
	Optional<ProductTechnicalSpecification> findById(String id);


}
    
   
