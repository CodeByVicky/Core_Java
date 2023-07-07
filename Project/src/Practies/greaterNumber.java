package Practies;

public class greaterNumber {

	public static void main(String[] args) {
		int a = 30;
		int b = 99;
		int c = 55;

		if (a > b && a > c) {
			System.out.println("greater number is:" + a);
		} 
		else if (b > a && b > c) {
			System.out.println("greater number is:" + b);
		} 
		else {
			System.out.println("greater number is:" + c);
		}

	}

}
