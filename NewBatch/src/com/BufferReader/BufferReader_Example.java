package com.BufferReader;
import java.io.InputStreamReader;
import java.io.BufferedReader;

import java.io.IOException;

public class BufferReader_Example {
	public static void main(String[] args) throws IOException{
		
		InputStreamReader is =new InputStreamReader(System.in);
		
		BufferedReader br= new BufferedReader(is);
		
		System.out.println("enter empolyee name");
		String name=br.readLine();
		
		System.out.println("enter employee age");
		int age=Integer.parseInt(br.readLine());
		
		System.out.println("enter salary");
		float sal=Float.parseFloat(br.readLine());
		
		System.out.println("enter gender");
		char ch=(char)br.read();
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(sal);
		System.out.println(ch);
		
	}

}
