package codeclause;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Login extends JFrame implements ActionListener{
	
	JLabel l;
	JButton b1,b2;
	
	Login()
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
	    
	    l=new JLabel("Fee Report");
	    l.setForeground(Color.white);
	    l.setFont(new Font("BOLD",Font.PLAIN,30));
	    l.setBounds(180, 10, 200, 50);
	    c.add(l);
	    
	    b1=new JButton("Admin Login");
	    b1.setBackground(Color.darkGray);
	    b1.setForeground(Color.white);
	    b1.setBounds(150, 150, 200, 50);
	    b1.addActionListener(this);
	    c.add(b1);
	    
	    b2=new JButton("Accountant Login");
	    b2.setBackground(Color.darkGray);
	    b2.setForeground(Color.white);
	    b2.setBounds(150, 250, 200, 50);
	    b2.addActionListener(this);
	    c.add(b2);
	    
	}
     public void actionPerformed(ActionEvent e)
     {
    	 if(e.getSource()==b1)
    	 {
    		 dispose();
    		 code c=new code();
    	 }
    	 if(e.getSource()==b2)
    	 {
    		 dispose();
    		 Account a=new Account();
    	 }
     }
	public static void main(String[] args) {
		
		new Login();

	}

}
