package com.jdbc;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.StringTokenizer;

import com.mysql.cj.jdbc.MysqlDataSource;
import com.util.conn.MySqlDbConn;

public class ReadFilePush_DB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr;
		BufferedReader br;
		StringTokenizer st;
		String id;
		String name;
		String data;
		int row=0;
		//declaration for push into the database
		Connection conn;
		PreparedStatement prp;
		ResultSet rs;
		String qry="insert into cust values(?,?)";
		
		 MySqlDbConn ds=new MySqlDbConn();
		 conn=ds.getConn();
		
		try {
			fr=new FileReader("emp.txt");
			br=new BufferedReader(fr);
			data=br.readLine();
			while(data!=null) {
				st=new StringTokenizer(data,"#");
				
				while(st.hasMoreElements()) {
					id=st.nextToken();
					name=st.nextToken();
					
					//System.out.println(id+" "+name);
					prp=conn.prepareStatement(qry);
					//set parameter
					prp.setInt(1,Integer.valueOf(id));
					prp.setString(2,name);
					
					row=prp.executeUpdate();
					
					}
				data=br.readLine();
			}
			//rs=prp.executeQuery();
			if(row>0) {
				System.out.println("Success");
			}
			 
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
