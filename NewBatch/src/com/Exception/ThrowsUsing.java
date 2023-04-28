package com.Exception;

//class MyException extends Exception {
//
//	@Override
//	public String getMessage() {
//		return "This is My Exception";
//	}
//}



public class ThrowsUsing {
	
	public static void show(int a) {
		
		try {
			System.out.println(5/a);
			//throw new MyException();
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("best in the world");
		}
	}
	
	

	public static void main(String[] args)  throws Exception{
		
		int a=1;
		
		ThrowsUsing.show(a);
		
//		try {
//			
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
		
System.out.println("thanks");
	}

}
