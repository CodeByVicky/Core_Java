package com.Inheritances;

class Engine{
	String EngineType;
	
	public Engine(String EngineType){
		this.EngineType=EngineType;
	}
	/*public String toString (){
		return " "+EngineType;
	}*/
	
	void engDisplay(){
		System.out.println(" "+EngineType);
	}
}

class Gear{
	String type;
	
	public Gear(String type){
		this.type=type;
	}
	
	/*public String toString (){
		return " "+type;
	}*/
	
	void gearDisplay(){
		System.out.println(" "+type);
	}
	
}

public class HasRelationCar {
	
	int modelno;
	String cname;
	Engine eng;
    Gear g;
	
	public HasRelationCar(int modelno,String cname,Engine eng,Gear gear){
		this.modelno=modelno;
		this.cname=cname;
		this.eng=eng;
		g=gear;
		
	}
	/*public String toString(){
		return modelno+" "+cname+" "+eng+" "+g;
	}*/
	void Display(){
		System.out.println(modelno+" "+cname+" "+eng+" "+g);
	}

	public static void main(String[] args) {
		/*HasRelationCar car=new HasRelationCar(101,"BMW",new Engine("petrol"),new Gear("auto"));
		System.out.println(car);*/
		
		Engine eng=new Engine("petrol");
		Gear gear=new Gear("auto");
		HasRelationCar car= new HasRelationCar(101,"BMW",eng,gear);
		//System.out.println(car);
		eng.engDisplay();
		gear.gearDisplay();
		car.Display();
	}

}
