package com.Inheritances;
class Vihical{
	int wheels=3;
}
class Car extends Vihical{
	void showCar(){
		wheels=4;
		System.out.println(wheels);
	}
}

class Truck extends Vihical{
	void showTruck(){
		wheels=8;
		System.out.println(wheels);
	}
}
		

public class InheritanceHirarchical {

	public static void main(String[] args) {
		
		
		Car c= new Car();
		c.showCar();
		
		Truck t=new Truck();
		t.showTruck();
	

	}

}
