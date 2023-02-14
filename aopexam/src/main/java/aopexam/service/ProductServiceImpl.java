package aopexam.service;

import aopexam.dao.ProductDao;
import aopexam.domain.Product;

public class ProductServiceImpl implements ProductService {
	private ProductDao productDao;

	@Override
	public void addProduct(Product product) {
		productDao.addProduct(product);
	}

	@Override
	public Product findByProductName(String name) {
		// TODO Auto-generated method stub
		return productDao.findProduct(name);
	}

}
