package iocexam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import iocexam.dto.User;
import iocexam.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
//	public UserController(UserService userService) {
//		this.userService = userService;
//	}
	
	public void joinUser() {
		//회원 가입해달라는 요청이 들어오면 요청시 보내준 값을 서비스 쪽에 보내서 회원 가입해달라고 부탁한다. 
		
		User user = new User();
		user.setName("kang");
		user.setEmail("carami@gmail.com");
		user.setPassword("1234");
		
		userService.joinUser(user);
	}

}
