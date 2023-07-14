package LogicalProgram;

public class CreateEvenOddNumber {

	public static void main(String[] args) {
	
		int num=123456789;
		int Even=1;
		int Odd=0;
		
		while(num!=0) {
			int find=num%10;
			if(find%2==0) {
				//System.out.println(find);
				Even=Even+10*find;
			}else {
				//System.out.println(find);
				Odd=Odd*10+find;
			}
			num/=10;
		}

		System.out.println(Even);
		System.out.println(Odd);
	}

}
