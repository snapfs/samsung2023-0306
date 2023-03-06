package sample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import sample.MyBean;

@Configuration
public class MyBeanConfig {

	@Bean
	public MyBean bean() {
		return new MyBean();
	}
	
	@Bean
	public MyBean bean2() {
		MyBean myBean = new MyBean();
		myBean.setName("carami");
		return myBean;
	}
	
	
}
