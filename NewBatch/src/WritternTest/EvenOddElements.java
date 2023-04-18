package WritternTest;

import java.util.Scanner;

public class EvenOddElements {
	//)  create a Array of integer and count the number of even  and odd elements from array.
	EvenOddElements(int arr[]){
		int evenCount=0;
		int oddCount=0;
		
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0)
	 	evenCount++;
		
			else
				oddCount++;
		}
		System.out.println("Even count is:"+evenCount );
		System.out.println("Odd count is:"+oddCount );
		
	}
	

	public static void main(String[] args) {
	Scanner can= new Scanner (System.in);
	System.out.println("enter size of array");
	
	int size=can.nextInt();
	int arr[]=new int [size];
	
	System.out.println("enter the elements");
	for(int i=0;i<arr.length;i++){
		arr[i]=can.nextInt();
	}
	EvenOddElements ev=new EvenOddElements(arr);
	
	}

}
