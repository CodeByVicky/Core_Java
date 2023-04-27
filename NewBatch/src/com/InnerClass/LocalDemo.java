package com.InnerClass;

class MyOuterClas
{
	int x=30;
	
	public void Display() {
		
		class MyLocalInnerClass{
			public void put() {
				System.out.println("hi this is  local");
			}
		}
		
		MyLocalInnerClass c= new MyLocalInnerClass();
		c.put();
	}
}

public class LocalDemo {

	public static void main(String[] args) {
		

		MyOuterClas m= new MyOuterClas();
		m.Display();
		
	}

}
