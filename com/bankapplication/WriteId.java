package com.bankapplication;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteId {
	FileWriter fw;
	BufferedReader br;
	String id="";
	
	void setId(String id) {
		try{ 
			fw=new FileWriter("Test.txt");
			 
			fw.write(id);
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				fw.close();
				//br.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	}
	
	
	


