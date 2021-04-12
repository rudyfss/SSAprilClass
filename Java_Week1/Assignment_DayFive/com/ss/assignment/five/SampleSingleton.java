
/**
 * In the package for day 5 assignments
 */
package com.ss.assignment.five;

import java.math.BigDecimal;;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


/**
 * @author Rudyf
 *We are supposed to fix this singleton so it works
 */
public static class SampleSingleton {
	private static Connection conn = null;
	private static SampleSingleton instance = null;
	
	public static SampleSingleton getInstance() {
		Samplesingleton();
		return instance;
	}
	
	//Create method to initialize our samplesingleton instance
	private static SampleSingleton() {
		SampleSingleton();
	}
	
	public static void databaseQuery(BigDecimal input) {
		conn = DriverManager.getConnection("url of database");
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("select * from tablename");
		int x=0;
		while(rs.next()) {
			x = rs.getInt(1) * input;
		}
	}
	

}
