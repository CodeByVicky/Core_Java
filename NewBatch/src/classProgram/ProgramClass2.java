package classProgram;

import java.util.Scanner;

public class ProgramClass2 {
	//find prime number between 1 ro 10
	public boolean checkPrime(int num){
		boolean isprime =true;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				isprime=false;
				break;
			}
		}
		return isprime;
	}
	

	void findPrimeNumber(){
		//find prime number between 1 ro 10
		for(int num=1;num<=10;num++)
		{
			boolean isprime=true;
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
				{
					isprime=false;
					break;
				}
			}
			if(isprime){
				System.out.println(num);
			}
		}
	}
	public void checkNumber(int num){
		//find kaparekar number
		int digitcount=0;
		
		int temp=num;
		while(num>0){
			digitcount++;
			num=num/10;
			
		}
		System.out.println(digitcount);
		num=temp;
		
		int sq=num*num;
		System.out.println(sq);
		int power=1;
		for(int i =1;i<=digitcount;i++){
			power=power*10;
			
		}
		System.out.println(power);
		
		int start =sq/power;
		int end =sq%power;
		if (num==(start+end)){
			System.out.println("kaparekar");
		}
		else
		{
			System.out.println("not kaparekar");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner can= new Scanner(System.in);
		System.out.println("enter number");
		int num= can.nextInt();
		System.out.println("--------------------------");
				
		ProgramClass2 pr=new ProgramClass2();
		pr.findPrimeNumber();
		
		System.out.println("--------------------------");
		for(int n=1;n<=10;n++){
			if(pr.checkPrime(n)){
				System.out.println(n);
			}
		}
		System.out.println("--------------------------");
		
		pr.checkNumber(num);
		

		
		
		
		
		
	}

}
