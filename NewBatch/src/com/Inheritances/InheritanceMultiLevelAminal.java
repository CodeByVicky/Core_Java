package com.Inheritances;

class Animal1{
	int weight=60;
	
}

class Wild extends Animal1{
	String name="tiger";
	
}
class Pet extends Wild{
	String color="yellow";
	void showPet(){
		System.out.println(weight+" "+name+" "+color);
	
	}
}

public class InheritanceMultiLevelAminal {

	public static void main(String[] args) {

		
		Pet p=new Pet();
		p.showPet();

	}

}
