package taskProgram;

import java.util.Scanner;

public class TrimorphicUsingRemainder {
	
	
	Scanner can= new Scanner(System.in);
	
	TrimorphicUsingRemainder(){
		System.out.println("enter number");
		int num=can.nextInt();
		
		int count=0;
		
		int square=num*num;
		int temp=num;
		
		while(temp>0){
			count++;
			temp=temp/10;
			
			
			
		}
		int lastdigitt=(int)(square%(Math.pow(10, count)));
		if(num==lastdigitt){
			System.out.println("auto");
		}
		else
			System.out.println("not");
	}
	public static void main(String[] args) {
		// 49=117649

		TrimorphicUsingRemainder tri=new TrimorphicUsingRemainder();
		
	}

}
