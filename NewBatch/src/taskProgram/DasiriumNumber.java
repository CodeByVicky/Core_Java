package taskProgram;

import java.util.Scanner;

public class DasiriumNumber {
	
	
	public void checknumber(int num){
		int count =0;
		int temp=num;
		while (0<num){
			count++;
			num=num/10;
		}
		//System.out.println(count);
		
		int sum=0;
		num=temp;
		while(num>0){
			int digit =num%10;
			
			int power=1;
			for(int i=1;i<=count;i++){
				power=power*digit;
			}
			sum=sum+power;
			count--;
			num=num/10;
			
		}
		if (temp==sum)
			System.out.println("Dasirium Number");
		
		else
			System.out.println("Not Dasirium Number");
	}

	

	public static void main(String[] args) {
		Scanner can= new Scanner(System.in);
		System.out.println("enter number");
		int num= can.nextInt();
		
		DasiriumNumber ch= new DasiriumNumber();
		ch.checknumber(num);
		
	}
}