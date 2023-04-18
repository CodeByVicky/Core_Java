package com.Inheritances;

class Animal{
	int weight;
	String color;
	
}

class Dog extends Animal{
	void showDog(){
		weight=10;
		color="black";
		System.out.println("Dog weight is:"+weight+" -"+color);
	}

	
}

class Cat extends Animal{
	void showCat(){
		weight = 5;
		color="white";
		System.out.println("Cat weight is:"+weight+" -"+color);
	}

	
}
class Rabbit extends Animal{
	
	void showRabbit(){
		weight=3;
		color= "red";
		System.out.println("Rabbit weight is:"+weight+" -"+color);
	}
	
}
public class InheritanceHirarchicalAnimal {

	public static void main(String[] args) {
		Dog d= new Dog();
		d.showDog();
		
		Cat c=new Cat();
		c.showCat();
		
		Rabbit r=new Rabbit();
		r.showRabbit();
		
		

	}

}
