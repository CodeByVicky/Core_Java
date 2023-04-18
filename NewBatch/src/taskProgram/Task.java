package taskProgram;

import java.util.Scanner;

public class Task {
	// prime number
	void primeFind(int num) {
		int i = 2, count = 0;
		while (i <= num) {
			if (num % i == 0)
				count++;

			i++;
		}

		if (count == 1)
			System.out.println("prime");

		else

			System.out.println("not prime");

	}

	void numberOfDigit(int num) {
		int digit = 0, count = 0;
//find digit to number
		while (0 < num) {
			digit = digit + (num % 10);
			count++;
			num = num / 10;
		}

		System.out.println(count);
	}

	void oddDigit(int num) {
		//find odd digir
		int digit = 0;
		while (0 < num) {
			digit = (num % 10);
			if (digit % 2 != 0)
				System.out.print(digit);
			num = num / 10;

		}

	}

	int reverse, sum = 0;
//palindrome number
	void palindrome(int num) {
		int n = num;
		while (0 < num) { // 432
							// 234
			reverse = (num % 10);
			// digit=reverse;
			sum = (sum * 10) + reverse;
			num = num / 10;
		}
		System.out.print(sum + ":");
		if (sum == n)
			System.out.println("Palindrome");

		else
			System.out.println("Not Palindrome");

	}
//Find spy number
	
	void spy(int num) {
		int sum1 = 1;
		while (0 < num) {
			sum = sum + (num % 10);
			sum1 = sum1 * (num % 10);
			num = num / 10;

		}
		// System.out.println(sum);
		// System.out.println(sum1);
		if (sum == sum1)
			System.out.println("SPY Number");
		else
			System.out.println("Not SPY Number");
	}

	public static void main(String[] args) {
		Scanner can = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = can.nextInt();

		Task pr = new Task();
		pr.primeFind(num);
		System.out.println("-------------------------------");
		
		pr.numberOfDigit(num);
		System.out.println("-------------------------------");
		
		pr.oddDigit(num);
		System.out.println("-------------------------------");
		
		pr.palindrome(num);
		pr.spy(num);

	}

}
