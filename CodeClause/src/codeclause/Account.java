package codeclause;

import java.awt.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Account extends JFrame implements ActionListener
{
	
	JLabel l;
	JButton b1,b2,b3,b4,b5;
	Account()
	{
		Container c=getContentPane();
		c.setLayout(null);
		c.setBackground(Color.darkGray);
		setVisible(true);
		setBackground(Color.darkGray);
		setTitle("Fee Report");
		setSize(500,500);
		setLocation(200,100);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    
	    l=new JLabel("Accountant View");
	    l.setForeground(Color.white);
	    l.setFont(new Font("BOLD",Font.PLAIN,20));
	    l.setBounds(180, 10, 200, 50);
	    c.add(l);
	    
	    b1=new JButton("Add Student");
	    b1.setBounds(70,100,150,50);
	    b1.addActionListener(this);
	    b1.setBackground(Color.white);
	    b1.setForeground(Color.black);
	    c.add(b1);
	    
	    b2=new JButton("View Student");
	    b2.setBounds(250,100,150,50);
	    b2.addActionListener(this);
	    b2.setBackground(Color.white);
	    b2.setForeground(Color.black);
	    c.add(b2);
	    
	    b3=new JButton("Edit Student");
	    b3.setBounds(70,200,150,50);
	    b3.addActionListener(this);
	    b3.setBackground(Color.white);
	    b3.setForeground(Color.black);
	    c.add(b3);
	    
	    b4=new JButton("Due Fee");
	    b4.setBounds(250,200,150,50);
	    b4.addActionListener(this);
	    b4.setBackground(Color.white);
	    b4.setForeground(Color.black);
	    c.add(b4);
	       
	    b5=new JButton("Back");
	    b5.setBounds(160,270,150,50);
	    b5.addActionListener(this);
	    b5.setBackground(Color.white);
	    b5.setForeground(Color.black);
	    c.add(b5);
	       
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			dispose();
			AddStudent a= new AddStudent();
		}
		if(e.getSource()==b2)
		{
			dispose();
			Studentview s=new Studentview();
		}
		if(e.getSource()==b3)
		{
			dispose();
			Updatestudent u=new Updatestudent();
		}
		if(e.getSource()==b4)
		{
			
		}
		if(e.getSource()==b5)
		{
			dispose();
			Login l=new Login();
		}
	}

	public static void main(String[] args) {
	new Account();

	}

}
