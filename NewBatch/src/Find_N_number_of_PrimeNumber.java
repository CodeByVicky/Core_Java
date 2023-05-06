import java.util.Scanner;

public class Find_N_number_of_PrimeNumber {

	public static void main(String[] args) {
		
		Scanner can = new Scanner(System.in);
		
		System.out.println("enter Number");
		int n= can.nextInt();
		
		int count=0;
		int p=1;
		while(n>p) {
			
			for(int j=1;j<=p;j++) {
				
				
				for(int i=1;i<=j;i++) {
				System.out.println(i);
			
				//break;
					
				}
				
			}
			p++;
		}
		
		

	}

}
