package com.Array;

public class CharAcending {
	
	static void show(char arr[]){
		for(int i=0;i<arr.length;i++)
			for (int j=(i+1);j<arr.length;j++){
				if(arr[i]>arr[j]){
					char temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		for(char i:arr)
		{
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		char arr[]={'e','a','b','f','z'};
		
		show(arr);
		

	}

}
