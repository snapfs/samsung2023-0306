package iocexam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import iocexam.dao.UserDao;
import iocexam.domain.User;
@Service("userService")
public class UserServiceImpl implements UserService {
	
	private UserDao userDao;
	public UserServiceImpl() {
		
	}
//	@Autowired
	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Autowired
	@Qualifier("userCaramiDaoImpl")
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}



	@Override
	public void joinUser(User user) {
		// TODO Auto-generated method stub
		userDao.addUser(user);
	}

}
