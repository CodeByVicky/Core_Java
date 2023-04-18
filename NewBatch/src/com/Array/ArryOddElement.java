package com.Array;
import java.util.Scanner;

public class ArryOddElement {
	
	
	
	public void findMin(int a[]){
		int min=a[0];
		for(int i=0;i<a.length;i++){
			if(a[i]<min){
				min=a[i];
			}
		}
		System.out.println("min= "+min);
	}
	
	public void findOdd(int a[]){
		
		for(int i=0;i<a.length;i++){
			if(a[i]%2!=0){
				System.out.println(a[i]);
			}
		}
	}

	public static void main(String[] args) {
		Scanner can=new Scanner(System.in);
		
		System.out.println("enter sixe");
		int size=can.nextInt();
		int arr[]=new int [size];
		System.out.println("Enter the array elements");
		
		for(int i=0;i<arr.length;i++){
			arr[i]=can.nextInt();
			
			
		}
		ArryOddElement ar=new ArryOddElement();
		ar.findMin(arr);
		System.out.println("--------------------------------------------------");
		ar.findOdd(arr);

	}

}
