package taskProgram;

public class StaticVariables {
	//write a code to create class and class contain static and non-static 
	//variables try to access with both variables in static method and non-static 
	//method.
	
	int a=5,b=10;
	static int x=15,y=20;
	
	void var(){
		System.out.println("non-static variable "+a+" "+b);
		System.out.println("static variable "+x+" " +y);
	}
	
	static void svar(){
		StaticVariables v=new StaticVariables();
		System.out.println("non-static variable "+v.a+" "+v.b);
		System.out.println("static variable "+x+" "+y);
		
	}

	public static void main(String[] args) {
		StaticVariables st=new StaticVariables();
		
		st.var();
System.out.println("--------------------------------------------");
         st.svar();

	}

}
