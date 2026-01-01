package com.demointerface;
//import com.revise.demointerface.*;

public class DomesticeIMP implements DomensticInterface,GstInterface {

	int custId;
	String custName;
	
	
	 

	@Override
	public int calcBill(int noUnits){
		// TODO Auto-generated method stub
		int totCost=0;
		
		if (noUnits>=0 && noUnits<=50) {
		  totCost+=calc_0_50(noUnits);
		}
		
		else if(noUnits>=51 && noUnits<=100) {
			totCost+=calc_51_100(noUnits);
		}		
		else {
			totCost+=calc_get_100(noUnits);
		}
		
	    return totCost;
	}
	
	int calc_0_50(int units) {
		int sub=0;
		sub+=units*Z_50_UC;
		return sub;
	}
	
	int calc_51_100(int units) {
		int sub=0;
		sub+=calc_0_50(50);
		int temp=units-50;
		sub+=temp*F1_100_UC;
		return sub;
	}
	
	int calc_get_100(int units) {

		 int sub=0;
		sub+=calc_51_100(100);
		 int temp=units-100;
		 sub+=temp*GT_100_UC;
		 return sub;
	}

	@Override
	public float calcGst(int bill) {
		// TODO Auto-generated method stub
		
		float count=bill;
		
		if(count<200) {
			count+=bill*GST_MIN;
			System.out.println(GST_MIN);
			return count;
		}
		
		else {
			count+=bill*GST_MAX;
			System.out.println(GST_MAX);
			return count;
		}
		 
	}

}
