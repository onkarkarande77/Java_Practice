package com.inheritance;

public class InhDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sub[]= {"maths","phy","chem"};
		StdChild sc=new StdChild(1,"java",sub);
		sc.disp();

	}

}

 class StdParent{
	 int stdId;
	 String stdName;
	public StdParent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StdParent(int stdId, String stdName) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
	}
	
 void disp() {
	 System.out.println("Student Data "+stdId+" "+stdName);
 }	
	 
}
 
 class StdChild extends StdParent{
	 String sub[];
public StdChild() {
		super();
		// TODO Auto-generated constructor stub
	}
 public StdChild(int stdId, String stdName,String[] sub) {
		super(stdId, stdName);
		this.sub = sub;
		// TODO Auto-generated constructor stub
	}

void disp() {
	super.disp();
	for(int i=0;i<sub.length;i++) {
		System.out.println(sub[i]);
	}
}

	 
 }
 