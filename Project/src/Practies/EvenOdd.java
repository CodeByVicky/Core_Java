package Practies;
import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		Scanner can=new Scanner(System.in);
		System.out.println("enter number");
		int a=can.nextInt();
		
		if(a%2==0) {
			System.out.println("number is even");
		}
		else {
			System.out.println("number is odd");
		}

	}

}