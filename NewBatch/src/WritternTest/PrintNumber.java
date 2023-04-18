package WritternTest;
/*
13) Write a  program that prints the numbers
from 1 to 50. But for multiples of three print “buzz” instead of the
number and for the multiples of five print “fizz”. For numbers which
are multiples of both three and five print “ buzzfizz “. After program
looping is completed print how many times buzz was printed, fizz
was printed and buzzfizz was printed.

*/
public class PrintNumber {
	PrintNumber(){
int	countB=0,countF=0,countBF=0;
		
		for(int i=1;i<=50;i++){
			if(i%3==0){
				countB++;
				System.out.println(i+"-->"+"buzz");
			}
				
			if(i%5==0){
				countF++;
				System.out.println(i+"-->"+"fizz");
			}
			
			if(i%3==0 && i%5==0){
				countBF++;
				System.out.println(i+"-->"+"buzzfizz");
			}
			}
		System.out.println("===========================================");
		
		System.out.println("buzz:-->"+countB);
		System.out.println("fizz:-->"+countF);
		System.out.println("buzzfizz:-->"+countBF);
	
	}
	

	public static void main(String[] args) {
		PrintNumber pr=new PrintNumber();
	}

}
