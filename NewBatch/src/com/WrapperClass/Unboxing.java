package com.WrapperClass;

public class Unboxing {

	public static void main(String[] args) {

		Integer ite = 10;

		int x = ite.intValue();
		System.out.println(x);
		
		
		Character c='v';
		
		char ch= c.charValue();
		System.out.println(ch);
		
		Float f=4.5f;
		float fl= f.floatValue();
		System.out.println(fl);
		
		Byte b=5;
		byte by=b.byteValue();
		System.out.println(by);

	}

}
