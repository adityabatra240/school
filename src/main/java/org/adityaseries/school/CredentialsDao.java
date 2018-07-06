package org.adityaseries.school;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CredentialsDao {

	public boolean getCredentials(String user1, String password1) {
		// TODO Auto-generated method stub
		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/mysql","root","root"); 
			Statement stmt = con.createStatement();
			System.out.println("Created DB Connection....");
			ResultSet rs = stmt.executeQuery("select user,password from usertable");
			while(rs.next()){
				
				String user=rs.getString("user");
				String password=rs.getString("password");
				
				if(user.equalsIgnoreCase(user1) && password.equalsIgnoreCase(password1))
						{
					
					break;
				}
				else {
					return false;
				}
			}
			rs.close();
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

}
