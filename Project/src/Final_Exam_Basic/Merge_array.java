package Final_Exam_Basic;

public class Merge_array {

	public static void main(String[] args) {
		int arr1[]= {1,2,3,7};
		int arr2[]= {4,5,6};
		
		int arr[]=new int[arr1.length+arr2.length];
		
		for(int i=0;i<arr1.length;i++) {
			arr[i]=arr1[i];
		}
		
		int find=arr1.length;
		for(int i=0;i<arr2.length;i++) {
			arr[find]=arr2[i];
			find++;
		}
		
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}

}
