package sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sample.config.ApplicationConfig;
import sample.domain.Product;
import sample.service.ProductService;

public class ProductRun {

	public static void main(String[] args) {
		ApplicationContext context = null;
		
//		context = new ClassPathXmlApplicationContext("sample/config/applicationContext.xml");
		context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		ProductService service = context.getBean(ProductService.class);
		
		service.addProdcut(new Product("pen",2000));
		
		
		Product product = service.findByProductName("pen");
		
		System.out.println(product);
	}

}
