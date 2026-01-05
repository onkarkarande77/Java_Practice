package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.MysqlDataSource;
import com.util.conn.MySqlDbConn;

public class DemoRS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection conn;
		PreparedStatement prp;
		ResultSet rs;
		String qry="select * from cust";
		
	    MySqlDbConn ds=new MySqlDbConn();
	    conn=ds.getConn();
	    
	    try {
			prp=conn.prepareStatement(qry);
			rs=prp.executeQuery();

			while(rs.next()) {
				System.out.println("id is "+rs.getInt(1));
				System.out.println("name is "+rs.getString(2));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	}

}
