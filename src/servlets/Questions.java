package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.UserDAOImplementation;

@WebServlet("/Questions")
public class Questions extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	static ArrayList <Integer> randoms = new ArrayList <Integer> ();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		UserDAOImplementation user = new UserDAOImplementation();
		
		generateRandom(10);
		
		try
		{
			request.setAttribute("question", user.getQuestion(randoms.get(0)));
			request.getRequestDispatcher("/first-question.jsp").forward(request, response);
		}
		
		catch (Exception e)
		{
			
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}
	
	public static void generateRandom(int limit)
	{
		Random rand = new Random ();
		
		for (int i = 0; i < limit; i++)
		{
			int num = rand.nextInt(100);
			
			if (randoms.contains(num))
			{
				continue;
			}
			
			else
			{
				randoms.add(num);
			}
		}
	}
}
