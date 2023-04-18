package com.Array;
import java.util.Scanner;

import java.util.Arrays;


public class ReversArray {
	public static void revers(int a[]){
		System.out.println(Arrays.toString(a));
		int j=a.length-1;
		
		for (int i=0;i<a.length/2;i++){
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			j--;
			
		}
		System.out.println(Arrays.toString(a));
	}
	
	public static void main(String args[]){
		Scanner can=new Scanner(System.in);
		System.out.println("enter array size");
		int size= can.nextInt();
		int arr[]=new int [size];
		
		System.out.println("enter array element");
		for(int i=0;i<arr.length;i++){
			arr[i]=can.nextInt();
		}
		
		//int arr[]={6,5,4,6,5};
		ReversArray.revers(arr);
	}
}
