package Final_Exam_Basic;
import java.util.*;
public class Insertion_elements_Arrays {

	public static void main(String[] args) {
		int arr[]=new int [8];
	
		Scanner can=new Scanner(System.in);
			
		System.out.println("insart elements");
		int size=5;
		for(int i=0;i<size;i++) {
			arr[i]=can.nextInt();
		}

		System.out.println(Arrays.toString(arr));
		
		int val=6;
		int find=4;
		//System.out.println(arr.length);
		for(int i=size;i>find;i--) {
			arr[i]=arr[i-1];
		}
	//	System.out.println(Arrays.toString(arr));
		arr[find]=val;
		size++;
		System.out.println(Arrays.toString(arr));
		
	}

}
