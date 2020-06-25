package dto;

import bo.Validation;

public class UserLogin 
{
	private String username;
	private String password;
	private boolean loginSuccess;
	
	public UserLogin(String username, String password) 
	{
		setUsernameAndPassword(username, password);
	}

	public String getUsername() 
	{
		return username;
	}

	public void setUsernameAndPassword(String username, String password) 
	{
		if (Validation.loginValidation(username, password) == true)
		{
			this.username = username;
			this.password = password;
			setLoginSuccess(true);
		}
		
		else
		{
			setLoginSuccess(false);
		}
	}

	public String getPassword() 
	{
		return password;
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
