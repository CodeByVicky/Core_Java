package com.Array;

public class EvenOdd {
	void show(int arr[]){
		
         int count=0,count1=0;
		
		for(int i=0;i<arr.length;i++){
			
			if(arr[i]%2==0)
				
				count++;
			else
				count1++;
			
			
		}
		//System.out.println(count+" "+count1);
		
		int even[]=new int[count];
		int odd[]=new int[count1];
		
		   int e=0,o=0;
	        for(int i=0;i<arr.length;i++)
	        {
	            if(arr[i]%2==0)
	            {
	              even[e]=arr[i];   
	              e++;
	            }
	            else
	            {
	                odd[o]=arr[i]; 
	                o++;
	            }
	        }
	        
		for(int i=0;i<even.length;i++){
			System.out.print(even[i]+" ");
			
		}
		System.out.println();
		for(int i=0;i<odd.length;i++){
			System.out.print(odd[i]+" ");
		}
		
	}

	public static void main(String[] args) {
		// WAP to put even and odd elements of array in two separate arrays.
		
		int arr[]={4,2,3,8,5,6,7,8,9};
		
		EvenOdd ev =new EvenOdd();
		ev.show(arr);
		
		
	}

}
