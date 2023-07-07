package Exception_p;
class Pro{
	public void method1() {
		System.out.println("Method1");
		try {
			method2();
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
	public void method2() {
		System.out.println("Method2");
		method3();
	}
	public void method3() {
		System.out.println("Method3");
		int c=10/0;
		
	}
}

public class Excepton_Propogation {

	public static void main(String[] args) {
		Pro p=new Pro();
//		try {
//			p.method1();
//		}catch(Exception e) {
//			System.out.println(e);
//		}
		

		p.method1();
	}

}
