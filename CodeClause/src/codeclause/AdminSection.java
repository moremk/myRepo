package codeclause;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class AdminSection extends JFrame implements ActionListener{
	
	JLabel l;
	JButton b1,b2,b3;
    
	AdminSection()
	{
		Container c=getContentPane();
		c.setLayout(null);
		c.setBackground(Color.darkGray);
		setVisible(true);
		setBackground(Color.darkGray);
		setTitle("Admin Section");
		setSize(500,500);
		setLocation(200,100);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    
	    
	    l=new JLabel("Admin Section");
	    l.setForeground(Color.white);
	    l.setFont(new Font("BOLD",Font.PLAIN,30));
	    l.setBounds(150, 50, 200, 50);
	    c.add(l);
	    
	    b1=new JButton("Add Accountant");
	    b1.setBackground(Color.darkGray);
	    b1.setForeground(Color.white);
	    b1.setBounds(150, 150, 200, 50);
	    b1.addActionListener(this);
	    c.add(b1);
	    
	    b2=new JButton("View Accountant");
	    b2.setBackground(Color.darkGray);
	    b2.setForeground(Color.white);
	    b2.setBounds(150, 225, 200, 50);
	    b2.addActionListener(this);
	    c.add(b2);
	    
	    b3=new JButton("Back");
	    b3.setBackground(Color.darkGray);
	    b3.setForeground(Color.white);
	    b3.setBounds(150, 300, 200, 50);
	    b3.addActionListener(this);
	    c.add(b3);
	    
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			dispose();
			AddAccount a=new AddAccount();
		}
		if(e.getSource()==b2)
		{
            dispose();
			
		  AddView v=new AddView();
		}
		if(e.getSource()==b3)
		{
			dispose();
			Login l=new Login();
		}
	}
	public static void main(String[] args) {
		
       new AdminSection();
	}

}
