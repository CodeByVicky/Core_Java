package com.Array;

public class Accending_Using_Charctor {
	public void show(char arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					char temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			//System.out.println(arr[i]);
		}
		char max=arr[arr.length-1];
		System.out.println(max);
		
	}

	public static void main(String[] args) {
		
		char arr[]= {'a','k','c','b','r','n'};
		
		Accending_Using_Charctor ac=new Accending_Using_Charctor();
		ac.show(arr);
	}

}
