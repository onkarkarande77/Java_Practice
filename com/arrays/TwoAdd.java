package com.arrays;

public class TwoAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {11,2,11,7};
		int target=9;
		int add=0;
		
		for(int i=0;i<ar.length;i++) {
			for(int j=1;j<ar.length;j++) {
				add=ar[i]+ar[j];
				if(target==add) {
					System.out.println("index:"+i+" value:"+ar[i]+" "+" index:"+j+" value:"+ar[j]);
					break;
				}
			}
		}
		
		

	}

}
