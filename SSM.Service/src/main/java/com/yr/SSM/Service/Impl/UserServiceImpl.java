package com.yr.SSM.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yr.SSM.Entity.User;
import com.yr.SSM.Service.UserService;
import com.yr.dao.UserDao;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;
	public void add(User user) {
		// TODO Auto-generated method stub
		userDao.add(user);
	}

	public List<User> query() {
		// TODO Auto-generated method stub
		return userDao.queryAll();
	}

	public List<User> quer(Integer id) {
		// TODO Auto-generated method stub
		return userDao.query(id);
	}

	public void delete(Integer id) {
		// TODO Auto-generated method stub
		userDao.delete(id);
	}

	public void update(User user) {
		// TODO Auto-generated method stub
		userDao.update(user);
	}

	public User select(Integer id) {
		// TODO Auto-generated method stub
		return userDao.quer(id);
	}

}
