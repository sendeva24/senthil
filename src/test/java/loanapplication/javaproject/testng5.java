package loanapplication.javaproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class testng5 {
	
	//"jdbc:mysql://"+host+":"+port+"/qadbt";
	
	String host="localhost";
	String port="3306";
	
	@Test
	public void sendb() throws SQLException {
		
		Connection con=DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/qadbt","root" ,"Mayuran_38");
		
		Statement s=con.createStatement();
		ResultSet r=s.executeQuery("select * from qadbt.employeeinfo where id=1;");
		while (r.next())
		r.getString("name");
		r.getString("age");
		
		
		
	}
	
	
}
