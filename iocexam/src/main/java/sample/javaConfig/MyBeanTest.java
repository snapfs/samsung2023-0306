package sample.javaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import sample.MyBean;
import sample.config.MyBeanConfig;

public class MyBeanTest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyBeanConfig.class);

		MyBean bean1 =(MyBean) context.getBean("bean1");

		bean1.setName("kang");

		System.out.println(bean1.getName());

		MyBean bean2 = context.getBean("bean2", MyBean.class);

		bean2.setName("kim");

		System.out.println(bean2.getName());
		
		System.out.println(bean1 == bean2);
	}

}
