package sample.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sample.MyBean;

public class SpringExam01 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("exam01.xml");
		
		MyBean bean1 = (MyBean)context.getBean("bean1");
		
		bean1.setName("kang");
		
		System.out.println(bean1.getName());
	
	}

}
