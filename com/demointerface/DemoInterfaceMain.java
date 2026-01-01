package com.demointerface;
//import com.revise.inheritance.*;

public class DemoInterfaceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DomesticeIMP dm=new DomesticeIMP();
		DomensticInterface cust;
		GstInterface gst;
		
		cust=dm;
		
		int bill=cust.calcBill(120);
		System.out.println("total paid "+bill);
		gst=dm;
		System.out.println("bill with gst "+gst.calcGst(bill));

	}

}
