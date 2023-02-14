package aopexam.dao;

import java.util.HashMap;
import java.util.Map;

import aopexam.domain.Product;

public class ProductDaoImpl implements ProductDao {
	
	private Map<String, Product> storage = new HashMap();

	@Override
	public void addProduct(Product product) {
		storage.put(product.getName(), product);
	}

	@Override
	public Product findProduct(String name) {
		// TODO Auto-generated method stub
		return storage.get(name);
	}

}
