
// read the data from the login table.

import java.sql.*;

class read_data
{
	Connection con;  //
	PreparedStatement ps; //
	ResultSet rs; //
	read_data()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");//driver load kiya hai 
	con= DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","12345");
		
	ps = con.prepareStatement("select * from login");
		
	rs = ps.executeQuery();

	while(rs.next())
	{
		System.out.println(rs.getString(1)+" "+rs.getString(2));
	}
	
		}
		catch(Exception e)
		{
		}
	}
	public static void main(String args[])
	{
		new read_data();
	}
}

			
	