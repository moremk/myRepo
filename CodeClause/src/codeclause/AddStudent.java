package codeclause;
import javax.swing.*;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class AddStudent extends JFrame implements ActionListener{
	
	JLabel l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
	JTextField t1,t2,t3,t4,t5,t6;
	JComboBox c1,c2,c3,c4;
	JTextArea a;
	JButton b1,b2;
	AddStudent()
	{
		Container c=getContentPane();
		c.setLayout(null);
		c.setBackground(Color.darkGray);
		setVisible(true);
		setBackground(Color.darkGray);
		setTitle("Fee Report");
		setSize(700,500);
		setLocation(200,100);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    
	    l=new JLabel("Add Student");
	    l.setForeground(Color.white);
	    l.setFont(new Font("BOLD",Font.PLAIN,20));
	    l.setBounds(250, 10, 200, 50);
	    c.add(l);
	    
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
	    
	    b1=new JButton("Add Student");
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
		if(e.getSource()==b1)
		{
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("Driver loaded");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/codeclause","root","");
				System.out.println("Connection Successfully");
				String name=t1.getText();
				String email=t2.getText();

				String fee=t3.getText();
				String paid=t4.getText();
				String due=t5.getText();
				String address=a.getText();
				String contact=t6.getText();
				if(name.isEmpty())
				{
					JOptionPane.showMessageDialog(this, "Enter a Name");
				}
				else if(email.isEmpty())
				{
					JOptionPane.showMessageDialog(this, "Enter a Email");
				}
				else if(paid.equals(""))
				{
					JOptionPane.showMessageDialog(this, "Enter a amount less than 10000");
				}
				else if(due.isEmpty())
				{
					JOptionPane.showMessageDialog(this, "Enter a Due Fee");
				}
				else if(address.isEmpty())
				{
					JOptionPane.showMessageDialog(this, "Enter a Adress");
				}
				else if(contact.isEmpty())
				{
					JOptionPane.showMessageDialog(this, "Enter a Contact");
				}
				else
				{
				
				String q="insert into student(name,email,course,fee,paid,due,address,city,state,country,contact)values('"+name+"','"+email+"','"+c1.getSelectedItem()+"','"+fee+"',"
						+ "'"+paid+"','"+due+"','"+address+"','"+c2.getSelectedItem()+"','"+c3.getSelectedItem()+"','"+c4.getSelectedItem()+"','"+contact+"')";
				PreparedStatement st=con.prepareStatement(q);
				st.executeUpdate(q);
				JOptionPane.showMessageDialog(this, "Student Added SuccessFully");
				con.close();
			}
			}
			catch(Exception e1)
			{
				System.out.println(e1);
			}
		}
		
		if(e.getSource()==b2)
		{
			dispose();
			Account a=new Account();
		}
		
	}

	public static void main(String[] args) {
		new AddStudent();

	}

}
