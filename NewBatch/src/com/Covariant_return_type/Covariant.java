package com.Covariant_return_type;

class Parent{
	Object show(){
		System.out.println("Parent method");
		return this;
	}
}

class Child extends Parent{
	String show(){
		super.show();
		System.out.println("child method");
		return  "String java";
	}
}

public class Covariant {

	public static void main(String[] args) {
	/*	Parent pa=new Parent();
		pa.show();
*/
		Child pa= new Child();
		System.out.println(pa.show());
	}

}
