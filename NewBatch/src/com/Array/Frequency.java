package com.Array;

public class Frequency {
	
	static public void show(char arr[]){
		for(int i=0;i<arr.length;i++){
			boolean visited=false;
			int count=1;
			for(int j=i-1;j>=0;j--){
				if(arr[i]==arr[j]){
					visited=true;
					break;
				}
			}
			if(visited==false){
				for(int k=i+1;k<arr.length;k++){
					if(arr[i]==arr[k])
						count++;
				}
				System.out.println(arr[i]+" =======>"+count);
			}
		}
		
		
		
	}
	
	public static void main(String args []){
		
		char arr[]={'a','d','g','y','a','d','a'};
		show(arr);
	}

}
