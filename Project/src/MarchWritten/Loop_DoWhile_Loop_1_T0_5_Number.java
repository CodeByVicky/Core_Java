package MarchWritten;

public class Loop_DoWhile_Loop_1_T0_5_Number {

	public static void main(String[] args) {
		// using for loop
		int j=1;
		
		for(int i=1;i<=5;i++) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		do {
			System.out.print(j+" ");
			j++;
		}while(j<=5);
	}

}
