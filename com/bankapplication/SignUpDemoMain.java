package com.bankapplication;
import com.revise.filehandle.bankapplication.signin.*;

public class SignUpDemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		 ReadId ri=new ReadId();
//		 System.out.println(ri.getId());
		
//		SignUpWriteAll sua=new SignUpWriteAll();
//		sua.getCustData();
		
		SignInTokenizer sit=new SignInTokenizer();
		sit.chkSignIn(sit);
	}

}
