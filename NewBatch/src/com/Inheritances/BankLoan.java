package com.Inheritances;

import assingment.GoldLoan;
import assingment.Loan;

class Bankk{
	Loan applyLoan(){
		System.out.println("apply loan");
		return  new Loan();
	}
}

class HDFCc extends Bankk{
	GoldLoan applyLoan(){
		super.applyLoan();
		System.out.println("gold loan");
		return new GoldLoan();
	}
}
public class BankLoan {
	

	public static void main(String[] args) {
		
		Loan lo=new Loan();
	
		GoldLoan go= new GoldLoan();
		Bankk bank =new HDFCc();
	bank.applyLoan();
				
	}

}
