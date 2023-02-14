package iocexam.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import iocexam.controller.UserController;
import iocexam.dao.UserDao;
import iocexam.dao.UserDaoImpl;
import iocexam.service.UserService;
import iocexam.service.UserServiceImpl;

@Configuration
public class UserConfig {
	@Bean
	public UserDao userDao() {
		return new UserDaoImpl();
	}
	
	@Bean
	public UserService userService(UserDao userDao) {
//		new UserServiceImpl(userDao);
		UserServiceImpl userService = new UserServiceImpl();
		userService.setUserDao(userDao);
		return userService;
	}
	
	@Bean
	public UserController userController(UserService userService) {
		return new UserController(userService);
	}

}
