package Final_Exam_Basic;

public class Prime_Number {

	public static void main(String[] args) {
		int num=5;
		int count=0;
		//boolean find=false;
		for(int i=1;i<num/2;i++) {
			if(num%i==0) {
				count++;
		//		find=true;
			}
		}
		if(count==1) {
			System.out.println("prime_number");
		}else
			System.out.println("nOt prime number");
		

	}

}
