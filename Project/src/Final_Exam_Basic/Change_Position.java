package Final_Exam_Basic;

import java.util.Arrays;

public class Change_Position {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		
		for(int i=0;i<arr.length/2;i++) {
			int find=0;
		
		find=arr[i];
		//System.out.println(find);
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=find;
			
		
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

}
