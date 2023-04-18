package com.Polymorphism_Overriding_RunTime;
class RBI{
	void Test(){
		System.out.println("RBI is main branch");
	}
}

class SBI extends RBI {
	@Override
	void Test(){
		super.Test();
		System.out.println("SBI is sub-branch");
		
	}
}

class HDFC extends SBI{
	
	void Test(){
		//super.Test();
		super.Test();
		System.out.println("HDFC is sub-branch");
	}
}

public class Overriding {
	

	public static void main(String[] args) {
		/*SBI sb= new SBI();
		sb.Test();*/
		
		HDFC hd = new HDFC();
		hd.Test();

	}

}
