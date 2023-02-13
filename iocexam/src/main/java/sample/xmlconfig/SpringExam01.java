package sample.xmlconfig;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sample.MyBean;

public class SpringExam01 {

	public static void main(String[] args) {
		
		System.out.println("ApplicationContext 생성전!!");
		ApplicationContext context = new ClassPathXmlApplicationContext("exam01.xml");
//		BeanFactory context = 
		System.out.println("ApplicationContext 생성후!!");
		
		MyBean bean1 = (MyBean)context.getBean("bean1");
		
		bean1.setName("kang");
		
		System.out.println(bean1.getName());
		
		MyBean bean2 = context.getBean("bean1",MyBean.class);
		
		System.out.println(bean2.getName());
		MyBean bean3 = context.getBean("bean5",MyBean.class);
		System.out.println(bean3.getName());
		
		System.out.println(bean1 == bean2);
		System.out.println(bean2 == bean3);
	
	}

}
