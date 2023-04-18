package classProgram;

import java.util.Scanner;

public class ArmmstringNumber {
	
	void checkArmstrngNumber(int n){
		int sum=0;int temp=n;
		while(0<n){
			int digit = n%10;
			sum=sum+(digit *digit *digit);
			n=n/10;
		}
		if (temp==sum)
			System.out.println("armstrong number");
		else
			System.out.println("not armstrong number");
				
	}

	public static void main(String[] args) {
		
				Scanner can = new Scanner (System.in);
				System.out.println("Enter number");
				int n=can.nextInt();
				
				ArmmstringNumber ar= new ArmmstringNumber();
				ar.checkArmstrngNumber(n);
				

	}

}
