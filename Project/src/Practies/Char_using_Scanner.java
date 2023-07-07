package Practies;
import java.util.Scanner;
public class Char_using_Scanner {

	public static void main(String[] args) {
		Scanner can=new Scanner(System.in);
		
		System.out.println("enter single charactor");
	
		char a=can.next().charAt(0);
		
		System.out.println(a);
		
		
		
		System.out.println("enter name");
		String s=can.next();
		
		System.out.println(s);

	}

}
