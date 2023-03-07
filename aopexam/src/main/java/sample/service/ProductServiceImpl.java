package sample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sample.dao.ProductDao;
import sample.domain.Product;
@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDao productDao;

	@Override
	public void addProdcut(Product product) {
		System.out.println("service의 addProdcut 실행");
		productDao.addProduct(product);
	}

	@Override
	public Product findByProductName(String name) {
		System.out.println("service의 findByProductName 실행");
		return productDao.findProduct(name);
	}

}
