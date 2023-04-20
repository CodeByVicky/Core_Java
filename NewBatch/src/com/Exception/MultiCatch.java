package com.Exception;

public class MultiCatch {

	public static void main(String[] args) {
	
		System.out.println("welcome");
		
		int arr[]= {2,5,8};
		try {
		System.out.println(arr[2]/67);
		}
		catch(NullPointerException n) {
			System.out.println(n);
		}
		catch(StringIndexOutOfBoundsException s) {
			System.out.println(s);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println(a);
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("thank you");
	}

}
