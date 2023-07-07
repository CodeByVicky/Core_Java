package Final_Exam_Basic;

import java.util.Arrays;

public class Insertion_Delete {

	public static void main(String[] args) {
	
		int arr[]=new int [10];
		
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		
//		insertion
	
		int find=3;
		int val=50;
		
		for(int i=4;i>find;i--) {
			arr[i]=arr[i-1];
		}

		arr[find]=val;
		
		
		System.out.print(Arrays.toString(arr));
		
		//delete
		int size=5;
		int del=3;
		
		for(int i=del;i<size;i++) {
			arr[i]=arr[i+1];
			
		}
		size--;
		System.out.println();
		System.out.print(Arrays.toString(arr));
	}

}
