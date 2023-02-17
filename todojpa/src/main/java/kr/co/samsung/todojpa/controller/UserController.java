package kr.co.samsung.todojpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.samsung.todojpa.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private PasswordEncoder psEncoder;
	
	@PostMapping("/addUser")
	public String addUser(@RequestParam("email") String email, @RequestParam("password") String password) {
		userService.addUser(email, psEncoder.encode(password));
		
		return "redirect:/todo/list";
	}

}
