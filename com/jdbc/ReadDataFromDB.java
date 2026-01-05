package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.util.conn.MySqlDbConn;

public class ReadDataFromDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection conn;
		PreparedStatement prp;
		ResultSet rs;
		String qry="select * from country";
		
		MySqlDbConn ds=new MySqlDbConn();
		conn=ds.getConn();
		
		try {
			prp=conn.prepareStatement(qry);
			rs=prp.executeQuery();
			 
			 System.out.println("id"+" "+"name");
			while(rs.next()) {
				
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
