package magic;

import java.sql.*;


import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/magic")
public class magic extends HttpServlet {
	private static final long serialVersionUID = 1L;

 
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
	PrintWriter out=res.getWriter();
	res.setContentType("text/html");
	int id=0;
	String n=req.getParameter("nm");
	String p=req.getParameter("pd");
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","");
		System.out.println("Connection Successfully");
		Statement st=con.createStatement();

		String q="insert into magic values('"+id+"','"+n+"','"+p+"')";   
		st.executeUpdate(q);			
		out.println("insert successfully");
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	

	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","");
		System.out.println("Connection Successfully");
		Statement st=con.createStatement();
	
		String q="select * from magic";
		ResultSet rs=st.executeQuery(q);
	
		out.println("<html>");
		out.println("<body>");
		
		out.println("<table border=1>");
		out.println("<tr>");
		out.println("<td>Id</td>");
		out.println("<td>Name</td>");
		out.println("<td>Password</td>");
		out.println("<td>Update</td>");
		out.println("<td>Delete</td>");
		out.println("</tr>");
		
		while(rs.next())
		{
			out.println("<tr>");
			out.println("<td>"+rs.getString("Id")+"</td>");
			out.println("<td>"+rs.getString("Name")+"</td>");
			out.println("<td>"+rs.getString("Password")+"</td>");
			out.println("<td>"+"<a href='updateid="+rs.getString("id")+"'>Edit</a>"+"</td>");
			out.println("<td>"+"<a href='delete?id="+rs.getString("id")+"'>Delete</a>"+"</td>");
			out.println("</tr>");
		}
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
		
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	
		
	}

}
