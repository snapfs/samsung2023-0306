package aopexam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aopexam.dao.ProductDao;
import aopexam.domain.Product;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDao productDao;

	@Override
	public void addProduct(Product product) {
		System.out.println("addProduct 실행 ");
		productDao.addProduct(product);
	}

	@Override
	public Product findByProductName(String name) {
		// TODO Auto-generated method stub
		System.out.println("findByProductName 메소드 실행!!!");
		return productDao.findProduct(name);
	}

}
