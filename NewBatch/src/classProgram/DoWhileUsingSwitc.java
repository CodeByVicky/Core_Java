package classProgram;

import java.util.Scanner;

public class DoWhileUsingSwitc {

	public static void main(String[] args) {
		char ch;
// TODO Auto-generated method stub
do{
		int a, b, c;
		char operator;
		Scanner can = new Scanner(System.in);
		System.out.println("enter any number : ");
		a = can.nextInt();

		System.out.println("Addition press :+");
		System.out.println("Subtraction press :-");
		System.out.println("Multiplication press :*");
		System.out.println("Division press :/");

		Scanner can1 = new Scanner(System.in);
		operator = can1.next().charAt(0);

		switch (operator) {
		case '+':
			System.out.println("enter secound number : ");
			b = can.nextInt();
			System.out.println("Addition is  : " + (a + b));
			break;

		case '-':
			System.out.println("enter secound number : ");
			b = can.nextInt();
			System.out.println("Subtraction is  : " + (a - b));
			break;

		case '*':
			System.out.println("enter secound number : ");
			b = can.nextInt();
			System.out.println("Multiplication is  : " + (a * b));
			break;

		case '/':

			System.out.println("enter secound number : ");
			b = can.nextInt();
			if (b == 0) {
				System.out
						.println("Divisor should not be zero. ");

				System.out.println("please enter valid Number : ");
				b = can.nextInt();
				System.out.println("Division is  : " + (a / b));
			} else {
				System.out.println("Division is  : " + (a / b));

			}

			break;

		default:
			System.out.println("Something is Worng Please Enter Valid Number");
		

		}
		System.out.println("Do you want to contiue...");
		 ch=can.next().charAt(0);

	}while(ch=='y' || ch =='Y');
	}
}
