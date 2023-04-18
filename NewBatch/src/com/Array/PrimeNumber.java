package com.Array;

public class PrimeNumber {

	public static void main(String[] args) {
		int arr[]={45,9,8,3,6,7};
			
		for(int i=0;i<arr.length;i++){
			int count=0;
			for(int j=2;j<arr[i];j++){
				if(arr[i]%j==0){
					count++;
					break;
				}
				
			}
			if(count==0)
				System.out.println(arr[i]);
			}
			
		}
		

	}


