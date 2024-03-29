package codeclause;

import java.awt.Color;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class code extends JFrame implements ActionListener{
	
	JLabel l,l1,l2;
	JTextField t,t1;
	JButton b;
	
	
	code()
	{
		Container c=getContentPane();
		c.setLayout(null);
		c.setBackground(Color.darkGray);
		setVisible(true);
		setBackground(Color.darkGray);
		setTitle("Fee Report Login");
		setLocation(200,100);
		setSize(500,500);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    
	    l=new JLabel("Fee Report Login");
		l.setFont(new Font("BOLD",Font.PLAIN,20));
		l.setForeground(Color.cyan);
		l.setBounds(130, 50, 200, 50);
		c.add(l);
		l1=new JLabel("UserName");
		l1.setForeground(Color.magenta);
		l1.setFont(new Font("BOLD",Font.PLAIN,15));
		l1.setBounds(100,130,100,50);
		c.add(l1);
	    t=new JTextField();
		t.setBounds(200,150,120,25);
		c.add(t);
		
	    l2=new JLabel("Password");
		l2.setForeground(Color.magenta);
		l2.setFont(new Font("BOLD",Font.PLAIN,15));
		l2.setBounds(100,190,100,30);
		c.add(l2);
	    t1=new JTextField();
		t1.setBounds(200,200,120,25);
		c.add(t1);
		
	    b=new JButton("Login");
	    b.setBackground(Color.darkGray);
	    b.setForeground(Color.white);
		b.setBounds(150,250,120,50);
		c.add(b);
		b.addActionListener(this);
	}
    public void actionPerformed(ActionEvent e)
    {
    	if(e.getSource()==b)
    	{
    		  String un=t.getText();
			  String pd=t1.getText();
			  if(un.isEmpty()&&pd.isEmpty())
			  {
			  JOptionPane.showMessageDialog(b, "enter username and passoword");
			  }
			  else if(un.equals("admin")&&pd.equals("2000"))
				{
				  JOptionPane.showMessageDialog(b, "Login successfully");
				  dispose();
				  AdminSection a=new AdminSection();
				  
				}
			  else {
				  JOptionPane.showMessageDialog(b, "login failed");
			  }
    	}
    }
	public static void main(String[] args) {
		
        new code();
	}
	

}
