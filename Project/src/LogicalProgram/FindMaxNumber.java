package LogicalProgram;
//3.	There is array of numbers less than 10. 
//Write a program to create maximum number by combining these numbers. 
//e.g.  Array { 1 , 4, 9 ,2 , 5 } – output number should be  - 95421

import java.util.Arrays;

public class FindMaxNumber {

	public static void main(String[] args) {
		
		int arr[]=  {1,4,9,2,5};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}

		System.out.println(Arrays.toString(arr));

		String str="";
		
		for(int i=0;i<arr.length;i++) {
			str+=arr[i];
		}
		
		System.out.println(str);
		int num=Integer.parseInt(str);
		
		System.out.println(num);
		

	}

}
