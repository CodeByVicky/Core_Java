package WritternTest;

public class MinChar {
	
	MinChar (char arr[]){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(arr[i]>arr[j]){
					char temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			
			}
			
		}
		char min=arr[arr.length-1];
		System.out.println(min);
		
	
	}

	public static void main(String[] args) {
	/*	3) Write a program to find Minimum frequency char from an Array
		   e.g char arr[]={‘a’,’b’,’b’,’c’,’c’,’b’};
		output= a*/

		char arr[]={'a','b','b','c','c','b'};
		
		MinChar fr=new MinChar(arr);

	}

}
