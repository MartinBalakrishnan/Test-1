package model.records;

import interfaces.RecordInterface;

public class Clerk implements RecordInterface{

	private String username;
	private String password;
	
	public Clerk(String username, String password) {
		this.setUsername(username);
		this.setPassword(password);
	}
	
	@Override
	public String getAsFormattedString() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	

}
