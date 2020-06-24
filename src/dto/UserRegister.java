package dto;

public class UserRegister 
{
	private int userID;
	private String email;
	private String username;
	private String password;
	
	public UserRegister(int userID, String email, String username, String password) 
	{
		this.userID = userID;
		this.email = email;
		this.username = username;
		this.password = password;
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
		this.username = username;
	}

	public String getPassword() 
	{
		return password;
	}

	public void setPassword(String password) 
	{
		this.password = password;
	}
}