package com.Array;

import java.util.Scanner;



public class DuplicateElement {                                         //1 3 4 4 2 1
	public void show(int arr[]){
		
		
		for(int i=0;i<arr.length;i++){
			
			boolean find=false;
			int count=1;
			
			for(int j=i-1;j>=0;j--){
				if(arr[i]==arr[j]){
					find =true;
					break;
				}
				
			}
			if(find==false){
				for(int k=i+1;k<arr.length;k++){
					if(arr[i]==arr[k]){
						count++;
					}
				}
				if(count==2)
				System.out.print(arr[i]+" ");
			}
			
		}
	
		
	}
	public static void main(String[] args) {
	/*	Scanner can=new Scanner(System.in);
		
		System.out.println("enter size");
		int size=can.nextInt();
		int arr[]= new int[size];
		
		
		System.out.println("enter array elements");
		for(int i=0;i<arr.length;i++){
			
			arr[i]=can.nextInt();
		}*/
		int arr[]={1, 2, 3, 4, 2, 7, 8, 8, 3};
		DuplicateElement du=new DuplicateElement();
		du.show(arr);
		
	}

}
