package com.collection.list;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Demoj_Coll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileReader fr;
		BufferedReader br;
		
		ArrayList<EmployeData> al=new ArrayList<EmployeData>();
		
		StringTokenizer st;
		String data;
		FileWriter fw=null;
		
		try {
			fr=new FileReader("emp.txt");
			br=new BufferedReader(fr);
			
			fw=new FileWriter("empre.txt",true);
			
			data=br.readLine();
			while(data != null) {
				st=new StringTokenizer(data,"#");
				while(st.hasMoreElements()) {
					
					int id=Integer.parseInt(st.nextToken());
					String name=st.nextToken();
					int bsal=Integer.parseInt( st.nextToken());
					
					al.add(new EmployeData(id,name,bsal));
				}
				data=br.readLine();
			}
			System.out.println(al);
			System.out.println("Done");
			
			for(EmployeData ed:al) {
				
				
//				String id=String.valueOf(ed.getEmpId());
//				String name=ed.getName();
//				String bsal=String.valueOf(ed.getBsal());
//				String pf=String.valueOf(ed.getPF());
//				String hra=String.valueOf(ed.getHRA());
//				
//				fw.write(id+"#"+name+"#"+bsal+"#"+pf+"#"+hra+"\n");
				
				fw.write(String.valueOf(ed.getEmpId()));
				fw.write("#");
				fw.write(ed.getName());
				fw.write("#");
				fw.write(String.valueOf(ed.getBsal()));
				fw.write("#");
				fw.write(String.valueOf(ed.getPF()));
				fw.write("#");
				fw.write(String.valueOf(ed.getHRA()));
				fw.write("\n");
			}
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				fw.close();
			}
			
			catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}

class EmployeData{
	int empId;
	String name;
	int bsal;
	
	public EmployeData() {
		super();
		// TODO Auto-generated constructor stub
	}
    public EmployeData(int empId, String name, int bsal) {
		super();
		this.empId = empId;
		this.name = name;
		this.bsal = bsal;
	}
    
    
    @Override
	public String toString() {
		return "EmployeData [empId=" + empId + ", name=" + name + ", bsal=" + bsal + "]";
	}
	int getPF() {
    	return (int)(0.12f*bsal);
    }
    int getHRA() {
    	return (int)(0.15f*bsal);
    }
  
     //getter methods
	public int getEmpId() {
		return empId;
	}
	public String getName() {
		return name;
	}
	public int getBsal() {
		return bsal;
	}	
}
