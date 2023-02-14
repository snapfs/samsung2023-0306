package iocexam.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"iocexam.controller","iocexam.dao","iocexam.service"})
public class UserConfig {
//	@Bean
//	public UserDao userDao() {
//		return new UserDaoImpl();
//	}
//	
//	@Bean
//	public UserService userService(UserDao userDao) {
////		new UserServiceImpl(userDao);
//		UserServiceImpl userService = new UserServiceImpl();
//		userService.setUserDao(userDao);
//		return userService;
//	}
//	
//	@Bean
//	public UserController userController(UserService userService) {
//		return new UserController(userService);
//	}

}
