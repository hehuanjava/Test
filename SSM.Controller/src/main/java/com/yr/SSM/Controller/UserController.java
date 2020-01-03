package com.yr.SSM.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.yr.SSM.Entity.User;
import com.yr.SSM.Service.UserService;

/**
 * Hello world!
 *
 */
@Controller
public class UserController 
{
   @Autowired
   private UserService userService;
   
   @RequestMapping(value="/query")
   public String query(Map<String, Object> map) {
	   map.put("user", userService.query());
	   return "list";
   }
   
   /*
	 * 跳到添加页面
	 */
	@RequestMapping(value="/put")
	public String add(Map<String, Object> map) {
		map.put("userCline", new User());
		return "put";
	}
   
   /**
	 * 添加数据
	 * @return
	 */
	@RequestMapping(value="/inster",method= RequestMethod.POST)
	public String Useradd(User user) {
		userService.add(user);
		return "redirect:/query";
	}
	
	/**
	 * 删除数据
	 */
	@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
	public String delete(@PathVariable("id") int id) {
		userService.delete(id);
		return "redirect:/query";
	}
	
	
	/**
	 * @ModelAttribute标识
	 * @param id
	 * @param map
	 */
	@ModelAttribute
	public void getStudent(@RequestParam(value="id",required=false) Integer id, Map<String,Object> map) {
	}
	
	/**
	 * 修改回显
	 * 
	 * @param id
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "/update{id}", method = RequestMethod.GET)
	public String input(@PathVariable("id") int id, Map<String, Object> map) {
		map.put("userCline", userService.quer(id).get(0));
		return "put";
	}
	
	
	/**
	 * 修改
	 */
	@RequestMapping(value="/inster",method=RequestMethod.PUT)
	public String update(User user) {
		userService.update(user);
		return "redirect:/query";
	}
}
