package com.selenium.Read;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.testng.annotations.Test;

import com.mysql.jdbc.Driver;

public class ReadDB {
	@Test
	public void dbTest() throws SQLException
	{
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/priya","root","root");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from employee");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
	}	

}
