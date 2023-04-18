package classProgram;

public class ThisExample {
	
	int x;
	int id,price;
	String name;
	
	public void input(int x){
		this.x=x;
	}
	
	public ThisExample(){
		this(11, "name", 1234);
		
	}

	
	public ThisExample(int id,String name, int price){
		//this();
		System.out.println("this is parameter");
		
		this.id=id;
		this .name=name;
		this .price=price;
		//this.output();

	}
	

	
	public void output(){

	
		System.out.println("hello");
		this.input(100);
		System.out.println(x);
		
		System.out.println(id +" "+name+" "+price);
	}
	public static void main(String[] args) {
		/*ThisExample ex= new ThisExample ();
		
		ex.input(10);
		ex.output();
		*/
		ThisExample ex1=new ThisExample(1,"raju",100);
		ex1.output();
	}

}
