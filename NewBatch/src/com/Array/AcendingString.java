package com.Array;

import java.util.Arrays;

public class AcendingString {
	
	static void show(String arr[]){
		for (int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				
				if(arr[i].charAt(0)>arr[j].charAt(0)){
					String temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.println(arr[i]);
	  }
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		String arr[]={"mahesh","ganesh","rupesh","hitesh","hitesh"};

		show(arr);
	}

}
