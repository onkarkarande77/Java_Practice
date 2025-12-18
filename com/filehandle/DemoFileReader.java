package com.filehandle;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DemoFileReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr;
		BufferedReader br;
		String data;
		try {
			br=new BufferedReader(new FileReader("Test.txt"));
			
			data=br.readLine();
			while(data != null) {
            System.out.println(data);
            data=br.readLine();
			}
			
		}
		catch(FileNotFoundException fe) {
			fe.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
