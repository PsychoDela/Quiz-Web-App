package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import dto.UserRegister;

public class UserDAOImplementation 
{
	Connection connection = ConnectionManager.getInstance().getConnection();

	public ArrayList <UserRegister> getUsers() throws SQLException {

		ArrayList <UserRegister> users = new ArrayList <UserRegister> ();

		String query = "SELECT * FROM users";

		ResultSet rs = null;

		try (Statement statement = connection.createStatement()) 
		{
			rs = statement.executeQuery(query);

			while (rs.next()) 
			{
				users.add(new UserRegister(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
			}

		}

		return users;
	}
	
	public void addUser(String email, String username, String password) throws SQLException 
	{
		String query = "INSERT INTO useri (email, username, password) VALUES (?, ?, ?)";

		try (PreparedStatement statement = connection.prepareStatement(query)) 
		{
			statement.setString(1, email);
			statement.setString(2, username);
			statement.setString(3, password);

			statement.executeUpdate();

			System.out.println("User added to the database.");
		}
	}
		
	public void deleteUser(String username) throws SQLException
	{
		String query = "DELETE FROM users WHERE username = '" + username + "'";
		
		try (PreparedStatement statement = connection.prepareStatement(query)) 
		{
			statement.executeUpdate();

			System.out.println("User deleted.");
		}
	}
}
