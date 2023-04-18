package com.Array;

public class MinCharter {
	MinCharter(int arr[]){
		
		
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]<arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
					
				}
			}
		int max =arr[arr.length-1];
		System.out.println((char)max);
		
	}

	public static void main(String[] args) {
	
		int arr[]={'A', 'D', 'E', 'X', 'z', 'R'};
		
		MinCharter small=new MinCharter(arr);
		
	}

}
