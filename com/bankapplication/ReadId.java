package com.bankapplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadId {
	
	FileReader fr;
	BufferedReader br;
	String data="";
	
	public String getId() {
	
		try {
			fr=new FileReader("Test.txt");
			br=new BufferedReader(fr);
			
			data=br.readLine();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				fr.close();
				br.close();
				
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		return data;
	} 

}
