package com.abstractclass;

public class DemoAbstract_DynDisp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//this is the reff of the parent or abstract class
		Employee e;
		
		RegEmp re=new RegEmp(1,"java",21000);
		CtrEmp ce=new CtrEmp(2,"Spring");
		
		
       //here we match the reef of the parent to the child object reef variable 
		e=re;
		System.out.println(e.calSal());
		e.showData();//this method call for the specific reference
		e=ce;
		System.out.println(e.calSal());
		e.showData(); 
		
	}

}

 //parent class have an abstract method

 abstract class Employee{
	int empId;
	String empName;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	
	void showData() {
		System.out.println("Employee Data "+empId+" "+empName);
	}
	
	abstract int calSal();
}
 
 //child class that override the incomplete method from the parent abstract class
 
 class RegEmp extends Employee{
    int bsal;
	@Override
	int calSal() {
		// TODO Auto-generated method stub
		int pf=(int)(0.12f*bsal);
		return bsal-pf;
	}
	public RegEmp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RegEmp(int empId, String empName,int bsal) {
		super(empId, empName);
		this.bsal=bsal;
		// TODO Auto-generated constructor stub
	}
 }
 
 //second child class to the 
 
 class CtrEmp extends Employee{

	@Override
	int calSal() {
		// TODO Auto-generated method stub
		return 25000;
	}

	public CtrEmp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CtrEmp(int empId, String empName) {
		super(empId, empName);
		// TODO Auto-generated constructor stub
	}
	
	 
 }
