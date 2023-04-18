package taskProgram;

import classProgram.ThisExample;
//use of thsi three type
public class ThisUshig3 {

	int a,b;
	
	
	public  ThisUshig3 (){
		this(4,9);
		System.out.println("defaut constructor");
		
	}
	
	public ThisUshig3(int a,int b){
		System.out.println("parameterized constructor");
		
		this.a=a;
		this.b=b;
		this.out();
	}
	public void out(){
		System.out.println(a+" "+b);
	}
	

	public static void main(String[] args) {
  
		
		ThisUshig3 thv=new ThisUshig3();
		//ThisUshig3 th=new ThisUshig3(5,6);
		

		
	//	System.out.println(x);


	}

}
