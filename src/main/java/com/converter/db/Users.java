package com.converter.db;

import java.io.Serializable;

public class Users implements Serializable{
	private static final long serialVersionUID = 1L;
	private int userID;
	private String login;
	private String password;
	public Users() {
		
	}
	public Users(int userID, String login, String password) {
		this.userID = userID;
		this.login = login;
		this.password = password;
	}
	public Users(String login, String password) {
		this.login = login;
		this.password = password;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getUserID() {
		return userID;
	}
}	