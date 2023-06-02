package com.String;

public class FrequcesOfCharater {
	
	public static void frequces(String s) {
			
	char arr[] = s.toCharArray();  
   	
	for(int i=0;i<arr.length;i++) {
		boolean find=false;
		int count=1;
		
		for(int j=i-1;j>=0;j--) {
			if(arr[i] ==arr[j]) {
				
				find=true;
				break;
			}
		}
		
		if(find ==false) {
			for(int k=i+1;k<arr.length;k++) {
				if(arr[i]==arr[k]) {
				//	if(arr[i]==' ')
				count++;
				
				}
			}
			System.out.println(arr[i]+"--->"+count);
		}
	}
	
	}

	public static void main(String[] args) {
		
		String s=("c programming language");
		FrequcesOfCharater.frequces(s);

	}

}
