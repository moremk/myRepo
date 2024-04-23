package magic;

import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/update")
public class update extends HttpServlet {
	private static final long serialVersionUID = 1L;

 
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
	PrintWriter out=res.getWriter();
	res.setContentType("text/html");
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","");
		System.out.println("Connection Successfully");
		Statement st=con.createStatement();

		String q="select * from magic where Id='?'  ";
	
		ResultSet rs=st.executeQuery(q);
	
		out.println("<html>");
		out.println("<body>");
		
		out.println("<table border=1>");
		out.println("<tr>");
		out.println("<td><label> Update Record </label></td>");
		while(rs.next())
		{
		out.println("<form action='updatereturn' method='GET'>");
		out.println("<tr>");
		out.println("<tr><td><input type='number' name='nb' value='"+ rs.getString("Id") +"'/></td></tr>");
		out.println("<tr><td><input type='text' name='nm' value='"+ rs.getString("Name") +"'/></td></tr>");
		out.println("<tr><td><input type='password' name='pd' value='"+ rs.getString("Password") +"'/></td></tr>");
		out.println("<tr><td><input type='submit' value='Update'></td></tr>");
		out.println("</tr>");
		
		}
		out.println("</table>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	}
	catch(Exception e) {
		out.println(e);
	}
}
}