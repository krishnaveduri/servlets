package servletInterface;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   PrintWriter pw=response.getWriter();		
	   String name=request.getParameter("name");
	   		String password=request.getParameter("password");
	   		if(password.equals("krishna"))
	   		{
	   			pw.println("hi");
	   			response.sendRedirect("home.html");
	   			
	   		}
	   		else
	   		{
	   			
	   			RequestDispatcher rd=request.getRequestDispatcher("/login.html");
	   			rd.include(request, response);
	   			pw.println("<h1 style="+"color:red;>"+"sorry password or username is incorrect"+"<h1>");
	   		}
    }
	

}
-------------------------------------------------login.html---------------------------------------------------
	<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<form action="Login">
<label>Username</label><br>
<input type="text" name="name"><br>
<label>Password</label><br>
<input type="password" name="password">
<input type="submit" value="submit">
</form>
</body>
</html>
------------------------------------------------------------
