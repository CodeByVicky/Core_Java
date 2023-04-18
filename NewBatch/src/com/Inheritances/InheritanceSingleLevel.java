package com.Inheritances;
class Ani{
	String foodType;
}

class Doggi extends Ani{
	public void showFood(){
		foodType= "DogFood";
		System.out.println(foodType);
	}
	
}
public class InheritanceSingleLevel  extends Ani{
	
	

	public static void main(String[] args) {
		
		Doggi dg= new Doggi();
		dg.showFood();
		
	
	}

}
