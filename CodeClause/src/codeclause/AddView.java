package codeclause;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class AddView  extends JFrame implements ActionListener{
	JTable jt;
	JButton b,b1;
	JScrollBar sb;
	AddView()
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
			AdminSection a=new AdminSection();
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
		String q="select * from code";
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
				String password=rs.getString(3);
				String email=rs.getString(4);
				String contact=rs.getString(5);
				String row[]= {id,name,password,email,contact};
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
		new AddView();

	}

}
