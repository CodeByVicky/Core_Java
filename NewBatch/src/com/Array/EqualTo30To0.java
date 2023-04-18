package com.Array;

public class EqualTo30To0 {
	
	void show(int arr[]){
		for(int i=0;i<arr.length;i++){
			if(arr[i]<30)
				System.out.println(arr[i]);
			
			if(arr[i]>30){
				
				System.out.println("0");
			}
			
		}
	}

	public static void main(String args[]){
		int arr[]={10,20,40,50,40,30,28};
		
		EqualTo30To0 eq =new EqualTo30To0();
		eq.show(arr);
	}
}
