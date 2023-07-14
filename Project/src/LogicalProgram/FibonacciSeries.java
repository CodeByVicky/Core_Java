package LogicalProgram;
import java.util.*;
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
public class FibonacciSeries {

	public static void main(String[] args) {
	
		Scanner can=new Scanner(System.in);
		System.out.println("enter number");
		int num=can.nextInt();
		
		int a=0;
		int b=1;
	
		if(num%2==0) {
		
		for(int i=0;i<(num)/2;i++) {
			System.out.print(a+",");
			a=b+a;
			System.out.print(b+",");
			b=b+a;
			
		}

		}else {
			for(int i=0;i<(num)/2;i++) {
				System.out.print(a+",");
				a=b+a;
				System.out.print(b+",");
				b=b+a;
				
			}
			System.out.print(a+".");
		}
	}

}
