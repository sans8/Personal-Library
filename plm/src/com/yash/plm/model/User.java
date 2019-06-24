package com.yash.plm.model;

public class User {
	@Override
	public String toString() {
		return "User [name=" + name + ", loginName=" + loginName + ", id=" + id + ", password=" + password + "]";
	}
	private String name;
	private String loginName;
	private int id;
	private String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
