package com.Couplling;

class Car{
	public void Start() {
		System.out.println("trip on car");
	}
}
class Bike{
public void Start() {
		System.out.println("trip on bike");
	}
	
}

public class TightCoupling {

	public static void main(String[] args) {
		Car car=new Car();
		car.Start();

		Bike bike=new Bike();
		bike.Start();
				


	}

}
