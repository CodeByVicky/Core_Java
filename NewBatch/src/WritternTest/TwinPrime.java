package WritternTest;

import java.util.Scanner;

public class TwinPrime {
	
	public TwinPrime(int num,int num1){
		int count=0;
		int count1=0;
		
		for(int i=1;i<=num;i++){
			if(num%i==0){
				count++;
			}
	
		}
		
		for(int i=1;i<=num1;i++){
			if(num1%i==0){
				count1++;
			}
	
		}
		
		
		if(count==2 && count1==2 && (num-num1==2 || num-num1==-2)){
			System.out.println("twin prime number");
		}
		else
			System.out.println("not twin prime number");
	}

	public static void main(String[] args) {
/*
    Write a program to find twin prime number. (Accept two no from
    user and check, if both are prime and their difference is 2 then they
    are twin prime). 
*/
		
		Scanner can = new Scanner(System.in);
    	System.out.println("enter first number ");
		int num = can.nextInt();
		
		System.out.println("enter second number ");
		int num1 = can.nextInt();
		
		TwinPrime tw=new TwinPrime(num,num1);
		
		
	}

}
