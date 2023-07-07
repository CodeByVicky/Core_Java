package String_Program;
import java.util.*;
//1,2, 1,3, 2,5, 3,8, 5,13, 8,21
public class Generates_Series {

	public static void main(String[] args) {
		Scanner can=new Scanner(System.in);
		System.out.println("enter number");
		int num=can.nextInt();
		
		int a=1;
		int b=2;
		System.out.print(a+","+b+",");
		for(int i=0;i<(num/2)-1;i++) {
			int temp=b;
			b=b+a;
			System.out.print(a+","+b+",");
			a=temp;
		}

	}

}
