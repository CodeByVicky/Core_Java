package LogicalProgram;

public class ReverseNumber {

	public static void main(String[] args) {
	
		int num=123;
		int res=0;
		
		while(num!=0) {
			int find=num%10;
			res=res*10+find;
			num/=10;
		}

		System.out.println(res);
	}

}
