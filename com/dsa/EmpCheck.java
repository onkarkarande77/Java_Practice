package com.dsa;
import java.util.*;

public class EmpCheck {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the size of the array");
		 int s=sc.nextInt();
		 System.out.println("Eneter the Array ");
		 int arr[]=new int[s];
		 
		 for(int i=0;i<s;i++) {
			 arr[i]=sc.nextInt();
		 }
		 
		//System.out.println(Arrays.toString(arr));
		System.out.println("enter for the element for the search");
		int chk=sc.nextInt();
		
		int count=0;
		int var=0;
		int id=0;
		while(chk>0) {
			 id++;
			 break;
			}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==chk) {
				var=++i;
				count++;
			}
		}
		
		
		
		System.out.println(id+" "+var+"  "+count);
	}

}
