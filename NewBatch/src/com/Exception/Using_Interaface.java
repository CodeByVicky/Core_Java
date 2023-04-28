package com.Exception;

public class Using_Interaface implements Addble{

	@Override
	public void NewEception() {
		
		System.out.println("interface Exception");
	}
	
	public void show() throws Exception{
		
		if(3>9) {
			throw new Exception();
		}
		
	}

	public static void main(String[] args) throws Exception{
		Using_Interaface us=new Using_Interaface();
		
		try {
			us.show();
		}
		catch(Exception e) {
			System.out.println(e);
		}
System.out.println("thanks");
	}


}
