package com.Array;


public class UniqueElements {
	void uniquue(int arr[]){
		
		
		for(int i=0;i<arr.length;i++){
			boolean find=false;
			int count=1;
			
			for(int j=i-1;j>=0;j--){
				if(arr[i]==arr[j]){
					find=true;
					break;
				}
			}
			if(find==false){
				for(int k=i+1;k<arr.length;k++){
					if(arr[i]==arr[k])
						count++;
					
				}
				if(count==1)
				System.out.print(arr[i]+" ");
			}
		}
		
	}

	public static void main(String[] args) {
		
		int arr[]={1, 2, 3, 5, 1, 5, 20, 2, 12, 10};
		
		UniqueElements uni=new UniqueElements();
		uni.uniquue(arr);

	}

}
