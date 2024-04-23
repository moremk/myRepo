package magic;

import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/updatereturn")
public class updatereturn  extends HttpServlet {
	private static final long serialVersionUID = 1L;

 
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
	PrintWriter out=res.getWriter();
	res.setContentType("text/html");
	
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","");
		System.out.println("Connection Successfully");
		Statement st=con.createStatement();

		String q="Update magic set Name='?',Password='?' where magic.Id='Id'";   
		st.executeUpdate(q);			
		out.println("update successfully");
	}
	catch(Exception e)
	{
		out.println(e);
	}
	
}
}