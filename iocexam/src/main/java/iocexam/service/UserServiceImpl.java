package iocexam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import iocexam.dao.UserDao;
import iocexam.dto.User;

@Service
public class UserServiceImpl implements UserService {
//	@Autowired
	private UserDao userDao;
	
	
	
//	public UserServiceImpl(UserDao userDao) {
//		this.userDao = userDao;
//	}
	
	@Autowired
	@Qualifier("caramiUserDaoImpl")
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}



	@Override
	public void joinUser(User user) {
		//회원가입에 필요한 비지니스가 있다면 여기에서 구현!! 
		//회원 정보를 저장하기 위해서 UserDAO 를 이용하는 코드 구현!!! 
		userDao.addUser(user);
	}

}
