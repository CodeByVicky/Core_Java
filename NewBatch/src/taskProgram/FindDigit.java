package taskProgram;

import java.util.Scanner;

public class FindDigit {

	public static void main(String[] args) {
		Scanner can= new Scanner(System.in);
		System.out.println("Enter number");
		int num=can.nextInt();
		
		System.out.println("Enter digit");
		int num1=can.nextInt();
		
		int count=0;
		
		while(num>0){
			int digit= num%10;
			if(digit==num1){
				count++;
				
			}
			num=num/10;
			
		}
		if(count==0)
		System.out.println("this digit not present");
		
		else
			System.out.println("digit is :"+count);
	

	}

}
