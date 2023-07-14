package LogicalProgram;

import java.util.*;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner can = new Scanner(System.in);
		System.out.println("enter number");
		int num = can.nextInt();

		int res = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0)
				res += i;
		}
		if (res == num)
			System.out.println("PerfectNumber");
		else
			System.out.println("Not PerfectNumber");
	}

}
