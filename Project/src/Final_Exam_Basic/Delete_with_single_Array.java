package Final_Exam_Basic;
import java.util.*;

public class Delete_with_single_Array {

	public static void main(String[] args) {
		
		int arr[]=new int [10];
		
		Scanner can=new Scanner(System.in);
		
		System.out.println("enter size");
		int size=can.nextInt();
		
		for(int i=0;i<size;i++) {
			arr[i]=can.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
		
	
		int find=4;

		for(int i=find;i<size;i++) {
			arr[i]=arr[i+1];
		}
		size--;
		System.out.println(Arrays.toString(arr));
	}

}
