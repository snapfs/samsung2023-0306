package kr.co.samsung.todojpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.co.samsung.todojpa.domain.Role;
import kr.co.samsung.todojpa.domain.User;
import kr.co.samsung.todojpa.repository.RoleRepository;
import kr.co.samsung.todojpa.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Transactional
	public User addUser(String email, String password) {
		User user = new User();
		user.setEmail(email);
		user.setPassword(password);
		
		Role role = roleRepository.findByRolename("ROLE_USER").orElseThrow();
		
		user.setRoles(List.of(role));
		
		return userRepository.save(user);
	}

}
