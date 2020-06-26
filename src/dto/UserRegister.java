package dto;

import bo.Validation;

public class UserRegister 
{
	private int userID;
	private String email;
	private String username;
	private String password;
	private boolean registrationSuccess;
	
	public UserRegister(int userID, String email, String username, String password) 
	{
		this.userID = userID;
		this.email = email;
		this.username = username;
		this.password = password;
		setRegistrationSuccess(true);
	}
	
	public UserRegister(String email, String username, String password) 
	{
		setEmail(email);
		setPassword(password);
		setUsername(username);	
	}

	public int getUserID() 
	{
		return userID;
	}

	public void setUserID(int userID) 
	{
		this.userID = userID;
	}

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}

	public String getUsername() 
	{
		return username;
	}

	public void setUsername(String username)
	{
		if (Validation.registerValidation(username) == true)
		{
			this.username = username;
			setRegistrationSuccess(true);
		}
	}

	public String getPassword() 
	{
		return password;
	}

	public void setPassword(String password) 
	{
		this.password = password;
	}

	public boolean isRegistrationSuccess() 
	{
		return registrationSuccess;
	}

	public void setRegistrationSuccess(boolean registrationSuccess) 
	{
		this.registrationSuccess = registrationSuccess;
	}
}