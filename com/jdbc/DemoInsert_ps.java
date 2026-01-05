package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.jdbc.MysqlDataSource;
import com.util.conn.MySqlDbConn;
 

public class DemoInsert_ps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn;
		PreparedStatement prp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id");
		String id=sc.nextLine();
		System.out.println("Enter Name");
		String name=sc.nextLine();
		String qry="insert into practice1 values(?,?)";
		
		 MySqlDbConn ds=new MySqlDbConn();
		 conn=ds.getConn();
		try {
			prp=conn.prepareStatement(qry);
			
			//set in the parameter
			prp.setInt(1,Integer.valueOf(id));
			prp.setString(2, name);
			
			int row=prp.executeUpdate();
			
			if(row>0) {
				System.out.println("success");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
