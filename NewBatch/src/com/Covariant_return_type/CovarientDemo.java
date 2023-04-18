package com.Covariant_return_type;

class Person{
	public Object getData(){
		System.out.println("this is parent data");
		return new Object();
	}
}

class Emp extends Person{
	@Override
		public String getData(){
		System.out.println("this is employee data");
		return new String ("employee name is yash");
	}
}

public class CovarientDemo {

	public static void main(String[] args) {
		Emp em= new Emp();
		em.getData();
		
	}

}
