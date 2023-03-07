package sample.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import sample.domain.Product;
@Repository
public class ProductDaoImpl implements ProductDao{
	private Map<String, Product> storage = new HashMap();

	@Override
	public void addProduct(Product product) {
		System.out.println("dao 의 addProduct 메소드 실행!!");
		storage.put(product.getName(), product);
	}

	@Override
	public Product findProduct(String name) {
		System.out.println("dao 의 findProduct 메소드 실행!!");
//		if(1==1)
//			throw new RuntimeException();
		return storage.get(name);
	}

}
