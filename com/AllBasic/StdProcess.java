package com.revise.AllBasic;

public class StdProcess {

	public StdProcess() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	int getTot(StdData sd) {
		return sd.mrk_chem+sd.mrk_phy;
	}

	int getAvg(StdData sd) {
		return this.getTot(sd)/2;
	}
	
	String getResult(StdData sd){
		int mark=this.getAvg(sd);
		
	if(mark>=35) {
		return "Candidate Pass Sucessfuly";
	}
	else {
		return "Fail";
	}
 }
	char getGrade(StdData sd) {
		int grade=this.getAvg(sd);
	
	if (grade>90)  
	 return 'A';
	
	else
		return 'B';
		
	} 
}
