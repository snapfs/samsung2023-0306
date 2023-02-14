package aopexam.dao;

import aopexam.domain.Product;

public interface ProductDao {
	void addProduct(Product product);
	Product findProduct(String name);
}
