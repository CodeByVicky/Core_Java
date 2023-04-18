package com.Inheritances;
class Moblie{
	String memorySize ="10GB";
}

class Apple extends Moblie{
	String camera ="13px";
}

class Iphone extends Apple{
	String name="iphone14pro";
	public void showDetails(){
		System.out.println(memorySize+" "+camera+" "+name);
	}
}

public class InheritanceMultiLevel {

	public static void main(String[] args) {
		Iphone p= new Iphone();
		p.showDetails();
	}

}
