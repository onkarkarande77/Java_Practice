package com.collection.set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class DemoSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		    //generic
		Set<EmployeData> s=new HashSet<EmployeData>();
		//creating object and putting same data then compare it 
		EmployeData ed1=new EmployeData(101,"java");
		EmployeData ed2=new EmployeData(101,"Spring");
		EmployeData ed3=ed2;
		//here we checking the true or false to there  reference variable that equals method or ==
		System.out.println("ed1 is equals ed2 "+ed1.equals(ed2));
		//two object are said to be equals if they share same memory location 
		System.out.println("ed2 is equals ed3 "+ed2.equals(ed3));
		System.out.println("ed3 is equals ed2 "+(ed3==ed2));
		
		//adding into the set
		s.add(ed1);
		s.add(ed2);
		s.add(ed3);
		//print all data from set s
		//that clearly view by overriding the toString method
	   System.out.println(s);
	   
	   //here we check hash code of the object ,we create the hashCode by own
	   System.out.println(s.hashCode()+" "+ed1.hashCode());
	   
	   //this loop is used to print all the data from the set s that is one by one in a sequence  
	   for(EmployeData ed:s) {
		  
		   System.out.println(ed);
	   }
	

		 
	}

}

//this is the class that we pass in the generic 
class EmployeData{
	int id;
	String name;
	
	public EmployeData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeData(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	//override the this method to view of output is clear
	@Override
	public String toString() {
		return "EmployeData [id=" + id + ", name=" + name + "]";
	}

	//we override this for the checking hashCode of this class objects
	@Override
	public int hashCode() {
		return  id+1;
	}
   //it help to checking the what the data in the our class previous or next objects when we created it
	@Override
	public boolean equals(Object obj) {
		
		if((obj instanceof EmployeData) && (((EmployeData)obj).id==this.id)) {
			return true;
		}
		else {
			return false;
		}
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		EmployeData other = (EmployeData) obj;
//		return id == other.id && Objects.equals(name, other.name);
	}
	
}
