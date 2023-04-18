package com.Abstraction;


abstract class Add{
	int a=10;
}

interface Addble{
	int b=5;
	 void result();
}


class Result extends Add implements Addble{
	int c;
	@Override
	public void result() {
		int c=a+b;
		System.out.println("addition is "+c);
	}
}

public class AbstractTask  {

	public static void main(String[] args) {
	Result re= new Result();
	re.result();
			
   }

}
