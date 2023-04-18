package com.Array;

public class SumOfRows {
	void show(int arr[][]){
		
		for(int i=0;i<arr.length;i++){
			int sum=0;
			for(int j=0;j<arr[i].length;j++){
				sum=sum+arr[i][j];
				System.out.print(arr[i][j]+" ");
			}
			System.out.print("sum ="+sum);
			System.out.println();
		}
	}
	

	public static void main(String[] args) {
	int arr[][]={{5,3,4},{2,4,1},{2,3,4}} ;

	SumOfRows su= new SumOfRows();
	su.show(arr);
	}

}
