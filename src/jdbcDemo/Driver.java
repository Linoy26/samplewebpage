package jdbcDemo;

import java.sql.*;

public class Driver {

	public static void main(String[] args) {
		try 
		{
			Connection myConn = DriverManager.getConnection("jdbc:mysql://mydb.cvarkfx2usg1.ap-south-1.rds.amazonaws.com:3306/lino","admin","adminadmin");
			Statement myStmt = myConn.createStatement();
			int myRs = myStmt.executeUpdate("INSERT INTO lino.file_expected_list (env,database_name,table_name,source_name) VALUES ('DEV','wslcrtl','file_exp','MANUAL')");
			
			System.out.println("1");		
					
		}
		catch (Exception exc)
		{
			exc.printStackTrace();
		}
	}

}
