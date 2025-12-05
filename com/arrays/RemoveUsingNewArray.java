package com.arrays;

public class RemoveUsingNewArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {10,20,30,40,50,10,20,30,40};
		
	     int temp[]=new int[ar.length];
	     int j=0;
	     
	     for(int i=0;i<ar.length;i++) {
	    	 boolean dup=false;
	    	 
	    	 for(int k=0;k<j;k++) {
	    		 
	    		 if(ar[i]==temp[k]) {
	    			 dup=true;
	    			 break;
	    		 }
	    	 }
	    	 
	    	 if(!dup) {
	    		 temp[j++]=ar[i];
	    	 }
	     }
        System.out.println("Array after removing duplicate");
        for(int i=0;i<j;i++) {
        	System.out.println(temp[i]+" ");
        }
	}

}
