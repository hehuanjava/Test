package com.yr.SSM.Entity;

/**
 * Hello world!
 *
 */
public class User 
{
   private Integer id;
   private String name;
   private String addr;
   private Integer age;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddr() {
	return addr;
}
public void setAddr(String addr) {
	this.addr = addr;
}
public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}
@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", addr=" + addr + ", age=" + age + "]";
}
   
}
