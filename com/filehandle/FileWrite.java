package com.filehandle;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileWriter fw=null;
		BufferedReader br;
		InputStreamReader isr;
		try {
			fw=new FileWriter("onkar.txt",true);
			isr=new InputStreamReader(System.in);
			br=new BufferedReader(isr);
			
			System.out.println("enter id");
			int id=Integer.parseInt(br.readLine());
			System.out.println("enter name");
			String name=br.readLine();
			String bsal=br.readLine();
			
			//Write data into text file
			fw.write(String.valueOf(id));
			fw.write("#");
			fw.write(name);
			fw.write("#");
			fw.write(bsal);
			fw.write("\n");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				fw.close();
				//br.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}
