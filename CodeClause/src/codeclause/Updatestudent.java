package codeclause;

import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.*;
public class Updatestudent extends JFrame implements ActionListener {
	
	JLabel l,l0,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
	JTextField t0,t1,t2,t3,t4,t5,t6;
	JComboBox c1,c2,c3,c4;
	JTextArea a;
	JButton b0,b1,b2;
	Updatestudent()
	{
		Container c=getContentPane();
		c.setLayout(null);
		c.setBackground(Color.darkGray);
		setVisible(true);
		setBackground(Color.darkGray);
		setTitle("Update Student");
		setSize(700,500);
		setLocation(200,100);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    
	    /*l=new JLabel("Update Student");
	    l.setForeground(Color.white);
	    l.setFont(new Font("BOLD",Font.PLAIN,20));
	    l.setBounds(250, 10, 200, 50);
	    c.add(l);*/
	    
	    l0=new JLabel("Id");
	    l0.setForeground(Color.white);
	    l0.setBounds(30, 10, 200, 50);
	    c.add(l0);
	    
	    l1=new JLabel("Name");
	    l1.setForeground(Color.white);
	    l1.setBounds(30, 50, 200, 50);
	    c.add(l1);
	    
	    l2=new JLabel("Email");
	    l2.setForeground(Color.white);
	    l2.setBounds(30, 100, 200, 50);
	    c.add(l2);
	    
	    l3=new JLabel("Course");
	    l3.setForeground(Color.white);
	    l3.setBounds(30, 150, 200, 50);
	    c.add(l3);
	    
	    l4=new JLabel("Fee");
	    l4.setForeground(Color.white);
	    l4.setBounds(30, 200, 200, 50);
	    c.add(l4);
	    
	    l5=new JLabel("Paid");
	    l5.setForeground(Color.white);
	    l5.setBounds(30, 250, 200, 50);
	    c.add(l5);
	    
	    l6=new JLabel("Due");
	    l6.setForeground(Color.white);
	    l6.setBounds(30, 300, 200, 50);
	    c.add(l6);
	    
	    l7=new JLabel("Address");
	    l7.setForeground(Color.white);
	    l7.setBounds(30, 350, 200, 50);
	    c.add(l7);
	    
	    l8=new JLabel("City");
	    l8.setForeground(Color.white);
	    l8.setBounds(350, 50, 200, 50);
	    c.add(l8);
	    
	    l9=new JLabel("State");
	    l9.setForeground(Color.white);
	    l9.setBounds(350, 100, 200, 50);
	    c.add(l9);
	    
	    l10=new JLabel("Country");
	    l10.setForeground(Color.white);
	    l10.setBounds(350, 150, 200, 50);
	    c.add(l10);
	    
	    l11=new JLabel("Contact");
	    l11.setForeground(Color.white);
	    l11.setBounds(350, 200, 200, 50);
	    c.add(l11);
	    
	    t0=new JTextField();
	    t0.setBounds(100,30,50,25);
	    c.add(t0);
	    
	    t1=new JTextField();
	    t1.setBounds(100,70,150,25);
	    c.add(t1);
	    
	    t2=new JTextField();
	    t2.setBounds(100,120,150,25);
	    c.add(t2);
	    
	    String [] str= {"Java","Php","Mysql","C","Html","Css","Android","JavaScript","Scala","Mongodb","C++","C#","dotNet"};
	    c1=new JComboBox(str);
	    c1.setBounds(100,170,150,25);
	    c.add(c1);
	    
	    t3=new JTextField("10000");
	    t3.setEditable(false);
	    t3.setBounds(100,220,150,25);
	    c.add(t3);
	    
	    t4=new JTextField();
	    t4.setBounds(100,270,150,25);
	    c.add(t4);
	    
	    t5=new JTextField();
	    t5.setBounds(100,320,150,25);
	    c.add(t5);
	    
	    a=new JTextArea(3,2);
	    a.setBounds(100, 370, 150, 50);
	    c.add(a);
	    
	    String [] str1= {"Pune","Nashik","Mumbai","Dhule","Aurangabad","Malegoan","Amravati","Nanded","Kholhapur","Sangli","Jalana","Parbhani","Satara"};
	    c2=new JComboBox(str1);
	    c2.setBounds(450,70,150,25);
	    c.add(c2);
	    
	    String [] str2= {"Maharashtra","Haryana","Gujarat","Bihar","Punjab","Karnataka","Uttar Pradesh","Assam"};
	    c3=new JComboBox(str2);
	    c3.setBounds(450,120,150,25);
	    c.add(c3);
	    
	    String [] str3= {"India","United States","Australia","China","France","Bangladesh","Canada","Germany"};
	    c4=new JComboBox(str3);
	    c4.setBounds(450,170,150,25);
	    c.add(c4);
	    
	    t6=new JTextField();
	    t6.setBounds(450,220,150,25);
	    c.add(t6);
	    
	    b0=new JButton("Search");
	    b0.setBounds(160,30,80,25);
	    b0.setBackground(Color.white);
	    b0.addActionListener(this);
	    c.add(b0);
	    
	    
	    b1=new JButton("Update Student");
	    b1.setBounds(450,270,150,40);
	    b1.setBackground(Color.white);
	    b1.addActionListener(this);
	    c.add(b1);
	    
	    b2=new JButton("Back");
	    b2.setBounds(450,320,150,40);
	    b2.setBackground(Color.white);
	    b2.addActionListener(this);
	    c.add(b2);  
	    
		
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b0)
		{
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("Driver loaded");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/codeclause","root","");
				System.out.println("Connection Successfully");
				 Statement st=con.createStatement();
			     
			       ResultSet rs=st.executeQuery("Select * From student where id=id");
			       while(rs.next())
			       {
			    	   String id=String.valueOf(rs.getInt(1));
						String name=rs.getString(2);
						String email=rs.getString(3);
						String fee=rs.getString(5);
						String paid=rs.getString(6);
						String due=rs.getString(7);
						String address=rs.getString(8);
						String contact=rs.getString(12);
						
						t0.setText(id);
						t1.setText(name);
						t2.setText(email);
						t3.setText(fee);
						t4.setText(paid);
						t5.setText(due);
						a.setText(address);
						t6.setText(contact);
			       }
				
				  con.close();
			}
			catch(Exception e1)
			{
				System.out.println(e1);
			}
		}
			if(e.getSource()==b1)
			{
				try
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					System.out.println("Driver loaded");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/codeclause","root","");
					System.out.println("Connection Successfully");
					 Statement st=con.createStatement();
					 String sql="UPDATE student SET fee=10000 WHERE id=id";
					 st.executeUpdate(sql);
					 JOptionPane.showMessageDialog(this, "Update Successfully");
				     con.close();
				     
				}
				
				catch(Exception e2)
				{
					System.out.println(e2);
				}
			}
			
			if(e.getSource()==b2)
			{
				dispose();
				Account a=new Account();
			}
		}
	
	

	public static void main(String[] args) {
		
      new Updatestudent();
	}

}
