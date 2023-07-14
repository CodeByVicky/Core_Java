package LogicalProgram;

import java.util.Scanner;

public class GreatestCommonFactor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter two number");
		int num1 = 56;
		int num2 = 87;

		while (num1 != num2) {
			if (num1 > num2) 
				
				num1 = num1 - num2;
			else 
				num2 = num2 - num1;
			
		}
		System.out.println("GCD " + num2);
	}
}