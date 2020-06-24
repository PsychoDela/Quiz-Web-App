package bo;

import dao.UserDAOImplementation;

public class Validation 
{
	public static boolean loginValidation(String username, String password)
	{
		UserDAOImplementation userList = new UserDAOImplementation ();
		
		try
		{
			for (int i = 0; i < userList.getUsers().size(); i++)
			{
				if (userList.getUsers().get(i).getUsername().equals(username) && userList.getUsers().get(i).getPassword().equals(password))
				{
					return true;
				}
			}
		}
		
		catch (Exception e)
		{
			
		}
		
		return false;
	}
}
