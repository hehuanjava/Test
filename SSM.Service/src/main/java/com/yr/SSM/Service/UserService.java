package com.yr.SSM.Service;

import java.util.List;

import com.yr.SSM.Entity.User;

public interface UserService {
	/**
	 * 添加
	 * @param User
	 */
	public void add(User user);
	/**
	 * 查询全部
	 */
	public List<User> query();
	/**
	 * 根据ID查询
	 * @param User
	 */
	public List<User> quer(Integer id);
	/**
	 * 删除
	 * @param User
	 */
	public void delete(Integer id);
	/**
	 * 修改
	 * @param User
	 */
	public void update(User user);
	
	/**
	 * 修改回显
	 * @param id
	 * @return
	 */
	public User select(Integer id);
}
