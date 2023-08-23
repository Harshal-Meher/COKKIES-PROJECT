

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class Login extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String name=request.getParameter("username");
		String password=request.getParameter("password");
		if(password.equals("abc"))
		{
        request.getRequestDispatcher("link.html").include(request, response);  

		out.print("<h2> Welcome Login Page "+name +"<br>");
		out.print("Your Password "+password +"</h2>");
		
		Cookie ck=new Cookie("uname",name);
		response.addCookie(ck);
		
		
		
		
		}
		else
		{
			
	 request.getRequestDispatcher("Login.html").include(request, response);  

		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
