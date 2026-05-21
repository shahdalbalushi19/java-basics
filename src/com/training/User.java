package com.training;

public class User {
	
	//1- attributes- 
	
	// in
	private String userId;
	private String username;
	private String userEmail;
	public User() {
		
	}
	// constructor
	public User(String userId, String userName, String userEmail) {
		this.userId = userId;
		this.username = userName;
		this.userEmail = userEmail;
				
	}

	// Static variables
	static String organizationName;
	public String getuserId() {
		return userId;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserId() {
		return userId;
	}
//2- behavior
public void setUserId(String userId) {
	if(userId != null)
	this.userId = userId;
}
//greater method
public String gettUserId() {
return this.userId;
}

}


