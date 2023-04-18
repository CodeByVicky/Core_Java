package WritternTest;

public class FebboSeries {

	public static void main(String[] args) {
		// febbo series 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
		
		int a=0,b=1,c;
		int num=10;
		for (int i =1;i<=num;i++){
			c=a+b;
			System.out.print(a+" ");
			
			a=b;
			b=c;
		}
	}

}
