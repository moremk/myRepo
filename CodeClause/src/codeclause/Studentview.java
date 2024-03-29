package codeclause;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class Studentview extends JFrame implements ActionListener {
	
	JTable jt;
	JButton b,b1;
	JScrollBar sb;
	Studentview()
	{
		Container c=getContentPane();
		c.setLayout(null);
		c.setBackground(Color.darkGray);
		setVisible(true);
		setBackground(Color.darkGray);
		setTitle("Admin Section");
		setSize(530,500);
		setLocation(200,100);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    
	    b=new JButton("View");
	    b.setForeground(Color.black);
	    b.setBackground(Color.white);
	    b.setBounds(10,10, 100, 50);
	    b.addActionListener(this);
	    c.add(b);
	    
	    b1=new JButton("Back");
	    b1.setForeground(Color.black);
	    b1.setBackground(Color.white);
	    b1.setBounds(130,10, 100, 50);
	    b1.addActionListener(this);
	    c.add(b1);
	     
	   
	    jt=new JTable();
	    jt.setBackground(Color.cyan);
	    jt.setBounds(50,80,400,300);
	    c.add(jt);
	    
	    JScrollPane b=new JScrollPane(jt);
        b.setBounds(00,100,500,300);
        b.setBackground(Color.blue);
       
        c.add(b,BorderLayout.CENTER);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			dispose();
			Account a=new Account();
		}
		if(e.getSource()==b)
		{
		
		try
		{
		     
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/codeclause","root","");
		System.out.println("Connection Successfully");
		Statement st=con.createStatement();
		String q="select * from student";
		ResultSet rs=st.executeQuery(q);
		ResultSetMetaData rsmd=rs.getMetaData();
		DefaultTableModel model=(DefaultTableModel)jt.getModel();
		int cols=rsmd.getColumnCount();
		String[] colName=new String[cols];
		for(int i=0;i<cols;i++)
			colName[i]=rsmd.getColumnName(i+1);
		model.setColumnIdentifiers(colName);
		
			while(rs.next())
			{
				String id=String.valueOf(rs.getString(1));
				String name=rs.getString(2);
				String email=rs.getString(3);
				String course=rs.getString(4);
				String fee=rs.getString(5);
				String paid=rs.getString(6);
				String due=rs.getString(7);
				String address=rs.getString(8);
				String city=rs.getString(9);
				String state=rs.getString(10);
				String country=rs.getString(11);
				String contact=rs.getString(12);
				String row[]= {id,name,email,course,fee,paid,due,address,city,state,country,contact};
			    model.addRow(row);
			}
			
		  
			st.close();
			con.close();
		}
		
		catch(Exception e1)
		{
			System.out.println(e1);
		}
		}
		}
	

	public static void main(String[] args) {
		
     new Studentview();
	}

}
