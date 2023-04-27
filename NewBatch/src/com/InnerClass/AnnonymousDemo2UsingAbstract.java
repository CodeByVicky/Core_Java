package com.InnerClass;

abstract class Template {
	abstract void mydesign();
}

public class AnnonymousDemo2UsingAbstract {

	public static void main(String[] args) {
		Template t = new Template() {
			public void mydesign() {
				System.out.println("this is design");
			}
		};

	}

}
