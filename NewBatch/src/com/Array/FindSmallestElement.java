package com.Array;

public class FindSmallestElement {
	FindSmallestElement(int arr[]){
		
		
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]<arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
					
				}
			}
		int max =arr[arr.length-2];
		System.out.println(max);
		
	}

	public static void main(String[] args) {
	
		int arr[]={5,6,7,4,6,8};
		
		FindSmallestElement small=new FindSmallestElement(arr);
		
	}

}
