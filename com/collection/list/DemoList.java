package com.collection.list;

import java.util.ArrayList;
import java.util.List;

public class DemoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List< StudentData> al=new ArrayList<StudentData>();
		
		StudentData sd=new StudentData(1,"java",89,88);
		
		al.add(sd);
		al.add(new StudentData(2,"spring",78,98));
		al.add(new StudentData(3,"spring boot",88,78));
		
		System.out.println(al);
		
		for(StudentData s:al) {
			s.showData();
			System.out.println(s.getTot());
		}

	}

}

class StudentData{
	int std_id;
	String name;
	int mks_csc;
	int mks_mm;
	
	public StudentData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentData(int std_id, String name, int mks_csc, int mks_mm) {
		super();
		this.std_id = std_id;
		this.name = name;
		this.mks_csc = mks_csc;
		this.mks_mm = mks_mm;
	}
	
	void showData() {
      System.out.println("student data is "+std_id+" "+name);	
	}
	
	int getTot() {
		int tot=mks_csc+mks_mm;
		return tot;
   }
	@Override
	public String toString() {
		return "StudentData [std_id=" + std_id + ", name=" + name + ", mks_csc=" + mks_csc + ", mks_mm=" + mks_mm + "]"+"\n";
	}
	
	
	
	
}

