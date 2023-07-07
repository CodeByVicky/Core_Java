package Final_Exam_Basic;

import java.util.Arrays;

public class Delet_from_array {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5};
		
		int temp[]=new int [arr.length-1];
		int find=0;
		int a=0;
		
		for(int i=0;i<arr.length;i++) {
			if(i!=find) {
				temp[a]=arr[i];
			
				a++;
			}
			else {
				arr[i]=0;
			}
		}
		System.out.println(Arrays.toString(temp));
		System.out.println(Arrays.toString(arr));

	}

}
