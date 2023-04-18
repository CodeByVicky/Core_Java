package WritternTest;
import java.util.Scanner;

public class SpyNumber {
	
	public SpyNumber(int num){
		int sum=0;
		int pro=1;
		while(num>0){
			int digit=num%10;
	
			sum=sum+digit;
			pro=pro*digit;
			num=num/10;
		}
		if (sum==pro){
			System.out.println("spy Number");
		}
		else
			System.out.println("Not spy Number");
	}

	public static void main(String[] args) {
		/*
		 * 4)write a java program to check given number is spy number or not e.g
		 * 123 if sum of digit is equals to product of digit the number is spy
		 * number i.e 123=1+2+3=6 and 1*2*3=6 so the number is spy number
		 */

		Scanner can=new Scanner(System.in);
		System.out.println("enter number");
		int num=can.nextInt();
		
		SpyNumber spy=new SpyNumber(num);
		
	}

}
