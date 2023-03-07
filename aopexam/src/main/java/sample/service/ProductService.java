package sample.service;

import sample.domain.Product;

public interface ProductService {
	void addProdcut(Product product);
	Product findByProductName(String name);

}
