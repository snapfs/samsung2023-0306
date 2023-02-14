package aopexam.service;

import aopexam.domain.Product;

public interface ProductService {
	void addProduct(Product product);
	Product findByProductName(String name);
}
