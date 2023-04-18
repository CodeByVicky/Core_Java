package WritternTest;

public class DivisibleBy1Or10 {
	
	
	public  DivisibleBy1Or10(int a,int b){
		
          
		
		for (int i=a;i<=b;i++){
			if(i%5==0 || i%10==0){
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		// 1)Write a program to print all numbers between 1 and 100 except
	//	the numbers which are divisible by 5or 10
		int a=1,b=100;
		DivisibleBy1Or10 di = new DivisibleBy1Or10(a,b); 
		
		
	}
}
