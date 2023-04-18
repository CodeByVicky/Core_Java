package taskProgram;

import java.util.Scanner;

public class Chocolate {
	
	public void cho(){
		Scanner can = new Scanner(System.in);
		System.out.println("Enter Rupee");
		int rup = can.nextInt();

		int count = 0;                                                              // 3-4w
		int a = 3;
	                                                                                 // 5-7w
	                                                                                 	// 7-10
	for (int i = 1; i <= rup; i++) {
			count++;

			if (count == a) {
				a += 3;
				count++;

			}

		}

		System.out.println("Total Chocolate is:"+count);

		
	}

	public static void main(String[] args) {
		Chocolate ch=new Chocolate();
		ch.cho();
	}
}
// 1 w
// 2 w
// 3 w

//   w
// 4 w
// 5 w

//   w
// 6 w
// 7 w

//   w
// 8 w
// 9 w
//   w