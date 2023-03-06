package sample.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sample.MyBean;

public class SpringExam02 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("exam02.xml");
		
		MyBean bean = context.getBean(MyBean.class);
		
		System.out.println(bean.getName());
		System.out.println(bean.getCount());
	}

}
