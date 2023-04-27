package com.InnerClass;

class Outer{
	int x=20;
	
	class InnerClass{
		public void show() {
			System.out.println("x="+x);
		}
	}
}

public class InnerClassDemo {
	public static void main(String[] args) {
		Outer o=new Outer();
		
		Outer.InnerClass in=o.new InnerClass();
		in.show();
	}

}
