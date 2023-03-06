package iocexam.service;

import iocexam.dao.UserDao;
import iocexam.domain.User;

public class UserServiceImpl implements UserService {
	private UserDao userDao;

	@Override
	public void joinUser(User user) {
		// TODO Auto-generated method stub
		userDao.addUser(user);
	}

}
