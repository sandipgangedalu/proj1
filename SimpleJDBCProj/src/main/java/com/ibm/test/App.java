package com.ibm.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App {
	public static void main( String[] args )
    {
    	Connection con =null;
    	PreparedStatement ps=null;
    	ResultSet rs=null;
        try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
			ps=con.prepareStatement("SELECT COUNT(*) FROM EMP");
		  rs=	ps.executeQuery();
			rs.next();
			System.out.println(rs.getInt(1));//count no is coming
		
        } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
