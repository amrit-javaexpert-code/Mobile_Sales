// read the data from the login table.

import java.sql.*;
class write_data
{
	Connection con;
	PreparedStatement ps;
	
	write_data()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
	con= DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","12345");
		
	ps = con.prepareStatement("insert into login values('sgt','Next time') ");
	
		int i = ps.executeUpdate();
		if(i>0)
			System.out.println("Record Inserted.");
				

			}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String args[])
	{
		new write_data();
	}
}

			
	