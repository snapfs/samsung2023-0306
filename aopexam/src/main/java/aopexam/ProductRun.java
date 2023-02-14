package aopexam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import aopexam.config.AppConfig;
import aopexam.domain.Product;
import aopexam.service.ProductService;

public class ProductRun {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	
//		ApplicationContext context = new ClassPathXmlApplicationContext("aopconfig/applicationContext.xml");
		
		ProductService service = context.getBean(ProductService.class);
		Product product = new Product();
		product.setName("연필");
		product.setPrice(3000);
		service.addProduct(product);
		
		Product pro2 =  service.findByProductName("연필");
		System.out.println(pro2);

	}

}
