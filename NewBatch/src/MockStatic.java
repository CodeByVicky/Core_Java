
public class MockStatic {

	static int a = 5;

	int c = 8;

	public void show() {

		a = c + a;
		System.out.println(a);

	}
	
	
	abstract  class A{
		
		A(){
			
		}
		 public abstract  void show() ;
			 
		 
	 }
		
	class B extends A{
		
		
		public void show() {
			
		}
	}

	public static void main(String[] args) {

		MockStatic mock = new MockStatic();
		mock.show();
		
		

	}

}
