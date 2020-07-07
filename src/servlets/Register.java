package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.UserDAOImplementation;
import dto.UserRegister;

@WebServlet("/Register")
public class Register extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String email = request.getParameter("email");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		UserRegister user = new UserRegister(email, username, password);
		
		if (user.isRegistrationSuccess() == true)
		{
			try
			{
				UserDAOImplementation userAdd = new UserDAOImplementation();
				
				userAdd.addUser(email, username, password);
			}
			
			catch (Exception e)
			{
				
			}
			
			request.getRequestDispatcher("/game.jsp").forward(request, response);
		}
		
		else
		{
			request.getRequestDispatcher("/regfailed.jsp").forward(request, response);
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}
}
