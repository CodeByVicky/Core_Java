package Practies;
import java.util.*;
public class primenum_pra {

	public static void main(String[] args) {
		
		Scanner can=new Scanner(System.in);
		System.out.println("enter number");
		
		int find=can.nextInt();
		int count=0;
		for(int i=2;i<find;i++) {
			if(find%i==0) {
				count++;
				
			}
		}

		if(count==0) {
			System.out.println("give number is preim");
		}
		else {
			System.out.println("not prime");
		}
		
		
	}

}
