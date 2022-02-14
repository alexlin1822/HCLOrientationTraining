package com.hcl.webapp;

public class Users {

	private String username;
	private String password;
	
	public Users() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the username
	 */
	public final String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public final void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public final String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public final void setPassword(String password) {
		this.password = password;
	}

	
	public boolean validateUserNamePwd() {
		boolean b=this.username.equals("admin") && this.password.equals("admin");
		return 	b;
	}
}
