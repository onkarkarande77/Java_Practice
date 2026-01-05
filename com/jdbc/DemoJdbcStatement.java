package com.jdbc;

import java.sql.Connection;
import java.sql.Statement;

import com.mysql.cj.jdbc.MysqlDataSource;
import com.util.conn.MyConn;
import com.util.conn.MySqlDbConn;

public class DemoJdbcStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection conn;
		Statement st;
		//MysqlDataSource ds;
		
		//String qry="insert into practice1 values(1,'maths')";
		String qry = "insert into practice1 values (1,'java')";

		/*with cte as (
           select *, ROW_NUMBER() over(partition by id,name order by id) as rn from practice1)
           Delete from cte where rn > 1*/
		
		try {
			
			
			//get connection 
			//conn=ds.getConnection();
			
			//embed the SQL query 
			//st=conn.createStatement();
		 
			
			//execute the query
			 
			//st=MyConn.getState();
			MySqlDbConn ds=new MySqlDbConn();
			conn=ds.getConn();
			st=conn.createStatement();
			int row=st.executeUpdate(qry);
			
			if(row>0) {
				System.out.println("Success");
			}
			 		
			
		}
		catch(Exception e) {
			e.printStackTrace();
			}
		
		

	}

}
