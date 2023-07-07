package String_Program;

import java.util.Arrays;
//[1, 2, 3, 4, 5, 6, 0, 0, 0, 0]
public class Delete_Insert_Elements {

	public static void main(String[] args) {
		
		int arr[]=new int[10];
		
		for(int i=0;i<6;i++) {
			arr[i]=i+1;
		}

		System.out.println(Arrays.toString(arr));
		
		//delete
		int pos=3;
		
		for(int i=pos;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
		
		System.out.println(Arrays.toString(arr));
		//[1, 2, 3, 5, 6, 0, 0, 0, 0, 0]
		//insert
		int val=50;
		for(int i=pos;i<arr.length-1;i++) {
			arr[i+1]=arr[i];
		}
		arr[pos]=val;
		System.out.println(Arrays.toString(arr));
	}

}
