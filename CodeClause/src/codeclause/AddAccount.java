package codeclause;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.regex.Pattern;

import javax.swing.*;

public class AddAccount extends JFrame implements ActionListener{
	
	JLabel l,l1,l2,l3,l4;
	JTextField t,t1,t2,t3;
	JButton b,b1;
	AddAccount()
	{
		Container c=getContentPane();
		c.setLayout(null);
		c.setBackground(Color.darkGray);
		setVisible(true);
		setBackground(Color.darkGray);
		setTitle("AirIndia Login");
		setSize(450,500);
		setLocation(200,100);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    
	    l=new JLabel("Add Accountant");
	    l.setForeground(Color.white);
	    l.setFont(new Font("BOLD",Font.PLAIN,20));
	    l.setBounds(100, 10, 300, 50);
	    c.add(l);
	    
	  
	 	l1=new JLabel("Name");
	 	l1.setForeground(Color.magenta);
	 	l1.setFont(new Font("BOLD",Font.PLAIN,15));
	 	l1.setBounds(100,80,100,50);
	 	c.add(l1);
	 	
	 	t=new JTextField();
	 	t.setBounds(200,100,120,25);
	 	c.add(t);
	 		
	 	l2=new JLabel("Password");
	 	l2.setForeground(Color.magenta);
	 	l2.setFont(new Font("BOLD",Font.PLAIN,15));
	 	l2.setBounds(100,140,100,30);
	 	c.add(l2);
	 	
	 	t1=new JTextField();
	 	t1.setBounds(200,150,120,25);
	 	c.add(t1);
	 	
		l3=new JLabel("Email");
	 	l3.setForeground(Color.magenta);
	 	l3.setFont(new Font("BOLD",Font.PLAIN,15));
	 	l3.setBounds(100,190,100,30);
	 	c.add(l3);
	 	
	 	t2=new JTextField();
	 	t2.setBounds(200,200,120,25);
	 	c.add(t2);
	 	
	 	l3=new JLabel("Contact");
	 	l3.setForeground(Color.magenta);
	 	l3.setFont(new Font("BOLD",Font.PLAIN,15));
	 	l3.setBounds(100,250,100,30);
	 	c.add(l3);
	 	
	 	t3=new JTextField();
	 	t3.setBounds(200,250,120,25);
	 	c.add(t3);
	 	
	 	b=new JButton("Add Account");
	    b.setBackground(Color.darkGray);
	    b.setForeground(Color.white);
		b.setBounds(100,300,120,50);
		c.add(b);
		b.addActionListener(this);
	 	
		b1=new JButton("Back");
	    b1.setBackground(Color.darkGray);
	    b1.setForeground(Color.white);
		b1.setBounds(223,300,100,50);
		c.add(b1);
		b1.addActionListener(this);
	 	
	 		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b)
		{
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("Driver loaded");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/codeclause","root","");
				System.out.println("Connection Successfully");
				String name=t.getText();
				String pass=t1.getText();
				String email=t2.getText();
				String contact=t3.getText(); 
				String regu = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                        "[a-zA-Z0-9_+&*-]+)*@" +
                        "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                        "A-Z]{2,7}$";
		
				
				if(name.isEmpty())
				{
					JOptionPane.showMessageDialog(this, "Enter a Name");
				}
				else if(pass.isEmpty())
				{
					JOptionPane.showMessageDialog(this, "Enter a Password");
				}

				else if(email.equals(regu))
				{
					JOptionPane.showMessageDialog(this, "Enter a Email");
				}
				else if(contact.isEmpty())
				{
					JOptionPane.showMessageDialog(this, "Enter a Contact");
				}
				else {
					JOptionPane.showMessageDialog(this, "Account Add SuccessFully");
				}
				String q="insert into code(name,password,email,contact)values('"+name+"','"+pass+"','"+email+"','"+contact+"')";
				PreparedStatement st=con.prepareStatement(q);
				st.executeUpdate(q);
				con.close();
				
			}
			
			catch(Exception e1)
			{
				System.out.println(e1);
			}
			
		}
		if(e.getSource()==b1)
		{
			dispose();
			AdminSection a=new AdminSection();
		}
	}

	public static void main(String[] args) {
	
    new AddAccount();
	}

}
