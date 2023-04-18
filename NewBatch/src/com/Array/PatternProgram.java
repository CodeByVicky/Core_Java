package com.Array;

import java.util.Scanner;

public class PatternProgram {
	
	void pattern1(int n){
	/*	*
		**
		***
		****   */
		
		for (int i=1;i<=n;i++){
			
		/*	****
			***
			**
			*    */
			for (int j =1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	void pattern2(int n){
		for (int i=1;i<=n;i++){
			for (int j =4;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	void pattern3(int n){
/*		
		1
		12
		123
		1234
		*/
		for (int i=1;i<=n;i++){
			for (int j =1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
	
	void pattern4(int n){
		
	/*	1234
		123
		12
		1*/
		
		for (int i=n;i>=1;i--){
			for (int j =1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
	
	void pattern5(int n){
	/*	
		4321
		432
		43
		4
*/
		
		for (int i=1;i<=n;i++){
			for (int j =4;j>=i;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
		
	}
	
	void pattern6(int n){
		for (int i=1;i<=n;i++){
			if(i==n){
				for (int j=1;j<=n;j++){
					System.out.print("*");
				}
			}
			else {
				for(int j =1;j<=n;j++){
					if (j==3)
						System.out.print("*");
					else
						System.out.print(" ");
				}
			}
			System.out.println();
		}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner can = new Scanner (System.in);
		System.out.println("Enter number");
		int n=can.nextInt();
		
		PatternProgram pr=new PatternProgram();
		/*pr.pattern1(n);
		System.out.println("----------------------");
		
		pr.pattern2(n);
		System.out.println("----------------------");
		
		pr.pattern3(n);
		System.out.println("----------------------");
		
		pr.pattern4(n);
		System.out.println("----------------------");
		
		pr.pattern5(n);
		System.out.println("----------------------");
		
		
*/
		pr.pattern6(n);


	}

}
