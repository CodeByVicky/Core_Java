package com.Array;

import java.util.Arrays;

public class CheckTwoArrayEqual {

	public static void main(String[] args) {
		int arr1[] = { 12, 22, 32, 42, 52,67};
		int arr2[] = { 52, 22, 62, 12, 42 ,32};
		
		/*boolean find=Arrays.equals(arr1, arr2);
		

			if(find==true){
					System.out.println("equal");
				}
				else
					System.out.println("not equal");
		*/
		int count=0;
		for(int i=0;i<arr1.length;i++){
			
			if(arr1[i]!=arr2[i]){
				count++;
			//	System.out.println(count);
				break;
				
			}
			
		}
		if(count==1)
			System.out.println("not equal");
		
		else
			System.out.println("equal");
				
	}
}
