package WritternTest;

import java.util.Scanner;

public class Trimorphic {
	
	long d = 0, d1 = 0, D = 0, D1 = 0;
	int count = 0;
	
	long num;
	public Trimorphic(long num){
		this.num=num;
		long temp = num;
		
		while (num > 0) {
			d = num % 10;
			D = D + d;
			count++;
			num = num / 10;

		}

		num = temp;
		long cub = num * num * num;

		for (int i = 1; i <= count; i++) {
			d1 = cub % 10;
			D1 = D1 + d1;
			cub=cub/10;

		}

		if (D == D1) {
			System.out.println("trimorphic");
		} else
			System.out.println("not trimorphic");
	}


	public static void main(String[] args) {
		// write a java program to check given number is trimorphic number or
		// not
		Scanner can = new Scanner(System.in);
    	System.out.println("enter number");
		long num = can.nextInt();
		
		Trimorphic tr=new Trimorphic(num);
		
	}

}
