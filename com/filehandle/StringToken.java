package com.filehandle;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class StringToken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr;
	       BufferedReader br;
	       StringTokenizer st;
	       String data;
	       
	       try {
	    	   br=new BufferedReader(new FileReader( "Test.txt"));
	    	   System.out.println("id"+"\t"+"name"+"\t"+"bsal");
	    	   
	    	   data=br.readLine();
	    	   while(data!=null) {
	    		   st=new StringTokenizer(data,"#");
	    		   
	    		   while(st.hasMoreElements()) {
	    			   
	    			   String id=st.nextToken();
	    			   String name=st.nextToken();
	    			   String bsal=st.nextToken();
	    			   
	    			   System.out.println(id+"\t"+name+"\t"+bsal);
	    			   
	    			   
	    		   }
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
