package com.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.util.conn.MySqlDbConn;

public class Demo_Start_BulkOprs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn;
		Statement st;
		
		MySqlDbConn ds=new MySqlDbConn();
		conn=ds.getConn();
		
		
		try {
			//set the auto commit feature to false
			conn.setAutoCommit(false);
			st=conn.createStatement();
			st.addBatch("insert into practice1 values(1,'java') ");
			st.addBatch("insert into practice1 values(4,'java') ");
			st.addBatch("insert into practice1 values(5,'java') ");
			
			//execute the batch
			st.executeBatch();
			
			//commit the opr
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			 try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		
		

	}finally {
		try {
			conn.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
   }
  }
