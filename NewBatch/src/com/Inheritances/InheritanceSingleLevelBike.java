package com.Inheritances;
class Bike{
	String cName="Honda";
}

class Shine extends Bike{
	String color="black";
	
	void showShine(){
		System.out.println(cName+" "+color);
	}
}



public class InheritanceSingleLevelBike {

	public static void main(String[] args) {
	
		Shine sh= new Shine();
		sh.showShine();
	
		
		
		
	}

}
