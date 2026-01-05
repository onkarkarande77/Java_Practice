package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.util.conn.MySqlDbConn;

public class ReadData_Inject_Into_collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn;
		PreparedStatement prp;
		ResultSet rs;
		int id;
		String name;
		String qry="select * from cust";
		MySqlDbConn ds=new MySqlDbConn();
		conn=ds.getConn();
		
		List<HoldData> hl=new ArrayList<HoldData>();
		
		try {
			
			 prp=conn.prepareStatement(qry);
			 rs=prp.executeQuery();
			 
			 while(rs.next()) {
				  id=rs.getInt(1);
				  name=rs.getString(2);
				  
				  //System.out.println(id +" "+name);
				  
				  hl.add(new HoldData(id,name));
			 }
			 
			 for(HoldData h:hl) {
				 
				 System.out.println(h);
			 }
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
        
	}

}

class HoldData{
	int id;
	String name;
	public HoldData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HoldData(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "HoldData [id=" + id + ", name=" + name + "]";
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	
}