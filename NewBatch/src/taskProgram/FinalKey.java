package taskProgram;

final class Bank{
	
	final void B(){
		System.out.println("This is bank");
	}
}
/*class RBI extends Bank{                            //cannot change final class
	
	 void B(){
		System.out.println("This is bank");
	}
}*/
/*class SBI extends Bank{
	
	void B(){
		System.out.println("This is SBI bank");
	                                              	//cannot change final method
	}
}*/

public class FinalKey {
	final int x;
	
	FinalKey(){
		x=16;
	}
	
	void sum(){
		int y=20;
		int z =x+y;
	//	x=z;                                           cannot change value in final
		System.out.println(z+x);
	}

	public static void main(String[] args) {
		FinalKey key= new FinalKey();
		key.sum();

	}

}
