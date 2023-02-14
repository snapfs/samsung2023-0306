package sample.autoConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import sample.MyBean;
import sample.config.MyBeanAutoConfig;

public class MyBeanTest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyBeanAutoConfig.class);
		
		MyBean bean = context.getBean("myBean",MyBean.class);
		bean.setName("kang");
		
		System.out.println(bean.getName());
	}

}
