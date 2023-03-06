package iocexam.controller;

import org.springframework.beans.factory.annotation.Autowired;

import iocexam.domain.User;
import iocexam.service.UserService;

public class UserController {
	@Autowired
	private UserService userService;
	
	public UserController() {
		System.out.println("UserController");
	}
	public UserController(UserService userService) {
		System.out.println("UserController(UserService userService) ");
		this.userService = userService;
	}
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public void joinUser() {
		User user = new User();
		user.setName("kang");
		user.setEmail("carami@nate.com");
		user.setPassword("1234");
		
		userService.joinUser(user);
	}

}
