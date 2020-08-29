/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wipro.sales.util;
import java.sql.*;
/**
 *
 * @author Raman
 */
public class DBUtil {
    private static Connection conn = null;
	
	 
	public static Connection getDBConnection() {
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "hr", "hr");
			return conn;
		} catch (SQLException e) {
			System.out.println("Connection could not be estanlished");
			e.printStackTrace();
			return null;
		}
	}
}
