package com.jdbc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.util.conn.MySqlDbConn;

public class Read_DB_Push {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection conn;
		PreparedStatement prp;
		ResultSet rs;
		String qry="select * from cust";
		MySqlDbConn ds=new MySqlDbConn();
		
		FileWriter fw=null;
		BufferedReader br;
		
		
		try {
			   fw=new FileWriter("emp.txt",true);
			   //br=new BufferedReader();
			
			
			  //db connection
			  conn=ds.getConn();
			  prp=conn.prepareStatement(qry);
			  rs=prp.executeQuery();
			  
			  while(rs.next()) {
				  
				  String id=String.valueOf(rs.getInt(1));
				  String name=rs.getString(2);
				  
				  fw.write(id+"#"+name+"\n");
				  
				  System.out.println(id+" "+name);
			
			  }
			  
			  
			  
			
		}catch(Exception e) {
			 
			e.printStackTrace();
		}
		finally {
             try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
