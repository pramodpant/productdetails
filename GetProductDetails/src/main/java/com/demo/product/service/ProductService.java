package com.demo.product.service;


import java.util.Optional;

import com.demo.product.beans.ProductTechnicalSpecification;

public interface ProductService {
	
	void create(ProductTechnicalSpecification todo);
	Optional<ProductTechnicalSpecification> findById(String id);
}
