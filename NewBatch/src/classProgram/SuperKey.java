package classProgram;
class Laptop{
	String memory = "128";
	public void Start(){
		System.out.println("Laptop is Starting ......");
	}
	public Laptop(){
		int a=10;
		System.out.println("this is Laptop");
	}
	
}

class Hp extends Laptop{
	
	int a;
	String memory = "256-Extendable";
	public void show(){
		System.out.println(memory+" "+super.memory);
		super.Start();
	
		
	}
	public Hp(){
		super();
		
		
		System.out.println("this is hp");
	}
	
	public void show1(){
		System.out.println();
	}
	
}

public class SuperKey {

	public static void main(String[] args) {
	Hp hp= new Hp();
	//System.out.println(hp.memory);
	
	hp.show();
	System.out.println(hp.a);
	}

}
