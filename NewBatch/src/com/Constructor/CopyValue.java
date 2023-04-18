package com.Constructor;

public class CopyValue {
	int cid;
	String cname;
	
	CopyValue(int id, String name){
		cid=id;
		cname=name;
		System.out.println(id+name);
	}
	
	CopyValue(CopyValue obj){
		cid=obj.cid;
		cname=obj.cname;
		System.out.println(obj.cid+obj.cname);
	}

	public static void main(String[] args) {
		/*
		 * 12) Write a program to copy values of one object into another by
		 * assigning the values of one object into another.
		 */
		
		CopyValue cv= new CopyValue(101,"  vicky");
		
		CopyValue cv1=new CopyValue(cv);
	}

}
