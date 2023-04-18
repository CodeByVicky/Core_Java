package com.Array;

public class EvenOddMarge {

	public static void main(String[] args) {
	int arr[]={11,2,4,6,5,7,8,66,77,80};
	
	int countEven=0;
	int countOdd=0;
	
	for(int i=0;i<arr.length;i++){
		if(arr[i]%2==0)
			countEven++;
		else 
			countOdd++;
	}
	
	int even[]=new int [countEven];
	int odd[]=new int [countOdd];
	
	int e=0,d=0;
	
	for(int i=0;i<arr.length;i++){
		if(arr[i]%2==0){
			even[e]=arr[i];
		e++;
		}
		else {
			odd[d]=arr[i];
		d++;
		}
	}
	for(int i:even){
		System.out.print(i+" ");
	}
	System.out.println();
	for(int i:odd){
		System.out.print(i+" ");
	}
	
	int marge[]=new int [arr.length];
	
	
	//int arr[]={11,2,4,6,5,7,8,66,77,80};
	
	
	
	int m=0,n=0,b=0;
	
	
		for(int i=0;i<arr.length/2;i++){
			
			marge[m]=even[n];
			m++;
			n++;
			marge[m]=odd[b];
			m++;
			b++;
			
	}
			
	
	for(int i:marge){
		System.out.println(i+" ");
	}

	}

}
