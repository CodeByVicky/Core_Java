package com.Constructor;

public class CycleConstructor {
	String bname;
	String color;
	int wheels;
	int price;
	int speed;
	String gear;
	
	
	CycleConstructor(){
		this("present");
		bname="Ranger";
		color="Black";
		wheels=2;
		
	}
	
	CycleConstructor(int price,int speed){
		this();
		this.price=price;
		this.speed=speed;
		this.display();
	}
	
	CycleConstructor(String gear){
		this.gear=gear;
		
	}
	void display(){
		System.out.println(bname+" "+color+" "+wheels+" "+price+" "+speed+" "+gear);
	}

	public static void main(String[] args) {
		//CycleConstructor cy=new CycleConstructor();
		CycleConstructor cy1=new CycleConstructor(15000,30);
		//cy1.display();

	}

}
