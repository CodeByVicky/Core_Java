package com.InnerClass;

interface Printable{
	void print();
}

public class AnnonymousDemoUsingInterface {

	public static void main(String[] args) {
		
		Printable p= new Printable() {
			
			public void print() {
				System.out.println("this is print");
			}
		};
		
	}

}
