package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.util.conn.MySqlDbConn;

public class Demo_RS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn;
		PreparedStatement prp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Entert id");
		int id=sc.nextInt(); 
		ResultSet rs;
		String qry="select * from practice1 where Id=? ";
		MySqlDbConn ds=new MySqlDbConn();
		conn=ds.getConn();
		 
			try {
				prp=conn.prepareStatement(qry);
				prp.setInt(1,id);
				rs=prp.executeQuery();
				
				
				while(rs.next()) {
				 System.out.println("id is "+rs.getInt(1));
				 System.out.println("Name is "+rs.getString(2));
				// System.out.println("Name is "+rs.getString(4));
				  
				 
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		 

	}

}
