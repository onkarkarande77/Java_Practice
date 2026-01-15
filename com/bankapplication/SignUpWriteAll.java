package com.bankapplication;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class SignUpWriteAll {
	FileWriter fw;
	BufferedReader br;
	InputStreamReader isr;
	ReadId ri=new ReadId();
	WriteId wi=new WriteId();
	
	public void getCustData() {
		try {
			
			fw=new FileWriter("onkar.txt",true);
			br=new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("custid is");
			
			int id=Integer.valueOf(ri.getId());
			 ++id;
          System.out.println("now the inc val from the text file " +id);
             System.out.println("enter first name");
             String fn=br.readLine();
             System.out.println("enter last name");
             String ln=br.readLine();
             System.out.println("enter password");
             String pass=br.readLine();
             System.out.println("enter ur mobile no");
             String mobNo=br.readLine();
             System.out.println("enter your age");
             String age=br.readLine();
             System.out.println("enter min bal");
             String minBal=br.readLine();
             
             fw.write(String.valueOf(id));
             fw.write("#");
             fw.write(fn);
             fw.write("#");
             fw.write(ln);
             fw.write("#");
             fw.write(pass);
             fw.write("#");
             fw.write(mobNo);
             fw.write("#");
             fw.write(age);
             fw.write("#");
             fw.write(minBal);
             fw.write("\n");
             
             wi.setId(String.valueOf(id));
		
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				fw.close();
				br.close();
				
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
