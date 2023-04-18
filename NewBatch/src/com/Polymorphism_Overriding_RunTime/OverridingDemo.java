package com.Polymorphism_Overriding_RunTime;
class Fruit{
	void Test(){
		System.out.println("eveey fruit is has some test");
	}
}
class Banana extends Fruit{
	@Override
	public void Test(){
		System.out.println("Banana is sweet");
	}
}
class Kiwi extends Fruit{
	public void Test(){
		System.out.println("kiwi is sour");
	}
}

public class OverridingDemo {

	public static void main(String[] args) {
		Banana b=new Banana();
		b.Test();
		
		Fruit f= new Kiwi();
		f.Test();
		
	}

}
