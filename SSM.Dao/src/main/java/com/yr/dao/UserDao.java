package com.yr.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.yr.SSM.Entity.User;
@Repository
public interface UserDao {
	
//	查询全部
	List<User> queryAll();
	
//	添加
	void add(User user);
	
//	删除
	void delete(int id);
	
//	修改
	void update(User user);
	
//	修改回显
	List<User> query(int id);
	
//	修改回显
	User quer(int id);
}
