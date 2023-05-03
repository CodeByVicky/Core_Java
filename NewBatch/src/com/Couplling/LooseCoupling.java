package com.Couplling;

interface Vihicle{
	public void  Start();
}

class Caro implements Vihicle{
	public void Start() {
		System.out.println("trip on car");
	}
}
class Bikeo implements Vihicle{
public void Start() {
		System.out.println("trip on bike");
	}
	
}

public class LooseCoupling {
	static Vihicle v;
	
	public void setVihicle(Vihicle v) {
		this.v=v;
	}

	public static void main(String[] args) {
		
		LooseCoupling lo=new LooseCoupling();
		lo.setVihicle(new Bikeo());
		v.Start();
	}

}
