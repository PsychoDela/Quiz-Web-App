package dto;

import bo.Validation;

public class UserLogin 
{
	private String username;
	private String password;
	private boolean loginSuccess;
	
	public UserLogin(String username, String password) 
	{
		setUsername(username);
		setPassword(password);
		setLoginSuccess(true);
	}

	public String getUsername() 
	{
		return username;
	}

	public void setUsername(String username) 
	{
		if (Validation.loginValidation(username, password) == true)
		{
			this.username = username;
		}
	}

	public String getPassword() 
	{
		return password;
	}

	public void setPassword(String password) 
	{
		if (Validation.loginValidation(username, password) == true)
		{
			this.password = password;
		}
	}

	public boolean isLoginSuccess() 
	{
		return loginSuccess;
	}

	public void setLoginSuccess(boolean loginSuccess) 
	{
		this.loginSuccess = loginSuccess;
	}
	
	
}
