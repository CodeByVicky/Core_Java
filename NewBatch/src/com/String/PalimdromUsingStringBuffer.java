package com.String;

public class PalimdromUsingStringBuffer {

	public static void main(String[] args) {

		String str = ("OTTO");
		
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb);
		System.out.println(sb.reverse());
		
		sb.reverse();

		String rev = sb.toString();
		

		if (rev.equals(str)){
			System.out.println("p");
		} else
			System.out.println("n");

	}

}
