import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;

import java.sql.*;

class login extends JFrame implements ActionListener
{ 
	JTextField t1;
	JPasswordField t2;

	ImageIcon i;
	JLabel l1,l2,l3;
	JButton b1,b2;
	LineBorder lb;

	Connection con;
	PreparedStatement ps;
	ResultSet rs;


  	login()
	{
		  i = new ImageIcon("pic1.gif");
		  l3 = new JLabel(i);

			lb = new LineBorder(Color.red,4);
		
		   b1 =new JButton("Submit");
		   b2 =new JButton("Exit");
		  l1=new JLabel("User ID");
		l1.setForeground(Color.white);
		b1.addActionListener(this);
		b2.addActionListener(this);
			
		  l2=new JLabel("Password");
l2.setForeground(Color.white);
		 t1=new JTextField();
		  t2=new JPasswordField();
		   l1.setBounds(40,50,100,20);
		   l2.setBounds(40,100,100,20);
		   t1.setBounds(150,50,100,20);
		   t2.setBounds(150,100,100,20);
		   b1.setBounds(200,200,100,20);
		   b2.setBounds(350,200,100,20);
		 l3.setBounds(0,0,i.getIconWidth(),i.getIconHeight());
		l3.setBorder(lb);

		t1.setForeground(Color.black);
		t2.setForeground(Color.black);

		b1.setBackground(Color.black);
		b2.setBackground(Color.black);
	
		b1.setForeground(Color.white);
		b2.setForeground(Color.white);

		   add(l1);
		   add(l2);
		  add(t1);
		  add(t2);
		  add(b1);
		  add(b2);
		   add(l3);
		   setSize(i.getIconWidth()+18,i.getIconHeight()+39);
		   setLayout(null);

		try
		{
		Class.forName("com.mysql.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","password");
		}
		catch(Exception e)
		{
		}

	

setLocation(
(Toolkit.getDefaultToolkit().getScreenSize().width-getWidth())/2,
(Toolkit.getDefaultToolkit().getScreenSize().height-getHeight())/2
);

		   setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		Object  o = ae.getSource();                                    
		if(o==b1)
		{
			String uname=t1.getText();
			String pass=t2.getText();
	
			try
			{
		ps=con.prepareStatement("select * from login where uname=? and pass=?");
		ps.setString(1,uname);
		ps.setString(2,pass);
		rs=ps.executeQuery();

			if(rs.next())
			{
JOptionPane.showMessageDialog(this,"Valid User","Done",JOptionPane.INFORMATION_MESSAGE);
			new home();
			this.dispose();
			}		
	
			else
JOptionPane.showMessageDialog(this,"Invalid User","Sorry",JOptionPane.ERROR_MESSAGE);			
			}
			catch(Exception e)
			{
			}

		}
		if(o==b2)
			System.exit(0);
	}	
	public static void main(String args[])
	{
		  new login();
	}
}