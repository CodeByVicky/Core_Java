package com.Exception;
import java.io.IOException;


public class throwExectionUsingMethod {
	public static void m1() throws IOException{
		throw new IOException("Device error");
	}
	
	public static void n1() throws IOException{
		m1();
	}

	public static void p1() {
		try {
			n1();
		}catch (IOException e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		p1();
		System.out.println("thank you");
	}

}
