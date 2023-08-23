

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Profile")
public class Profile extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
        request.getRequestDispatcher("link.html").include(request, response);  

        Cookie ck[]=request.getCookies(); 
		
		if(ck!=null)
		{  
	         String name=ck[0].getValue();  
	         if(!name.equals("")||name!=null)
	         {  
	             out.print(" <h1>Welcome Profile Page "+ck[0].getValue());  
	         }  
	         }else{  
	             out.print("Please login first");  
	             request.getRequestDispatcher("login.html").include(request, response);  
	         }  
	         out.close();  

			

    
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
