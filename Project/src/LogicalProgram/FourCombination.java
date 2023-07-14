package LogicalProgram;
//e.g. input string –  ‘PIZZA’   output – IZZAP , ZZAPI , ZAPIZ , APIZZ

import java.util.Arrays;

public class FourCombination {
	public static void main(String args[]) {

		String str = "PIZZA";

		char arr[] = str.toCharArray();
		
		char temp = 0;

		for(int j=0;j<10;j++) {
			 temp=arr[0];
		for (int i = 0; i < arr.length-1 ; i++) {

		
			
			arr[i]=arr[i+1];
			
		}
		arr[arr.length-1]=temp;
		System.out.println(Arrays.toString(arr));
	}
	}
}