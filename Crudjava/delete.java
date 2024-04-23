package magic;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/delete")
public class delete  extends HttpServlet {
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

		String q="DELETE FROM magic WHERE magic.Id = 'Id'";   
		st.executeUpdate(q);			
		out.println("delete successfully");
	}
	catch(Exception e)
	{
		out.println(e);
	}
	
	}
}
