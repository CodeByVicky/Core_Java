package LogicalProgram;

public class ArrayElementsINtoNumber {

	public static void main(String[] args) {
		int num=123;
		int res=0;
		
		while(num!=0) {
		int d=num%10;
		res=res*10+d;
		num/=10;
		}

	//	System.out.println(res);
		
		
		
		int arr[]= {1,2,3,4,6};
		
		for(int i=0;i<2;i++) {
			int n=n*10+arr[i];
			System.out.println(n);
		}
	}

}
