package Final_Exam_Basic;
//Shift all negative to end

public class Shift_all_negative_to_end {

	public static void main(String[] args) {
		int arr[]= {1,2,-6,-7,4,5,-1};
		int even=0;
		int odd=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				even++;
			}else
			{
				odd++;
			}
		}
		
		int arr1[]=new int[even];
		int arr2[]=new int [odd];
		int arr3[]=new int [even+odd];
		int a=0;
		int b=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				arr1[a]=arr[i];
				a++;
			}
			else {
				arr2[b]=arr[i];
				b++;
			}
		}
		
		for(int i=0;i<arr1.length;i++) {
			arr3[i]=arr1[i];
		}
		
		int find=arr1.length;
		for(int i=0;i<arr2.length;i++) {
			arr3[find]=arr2[i];
			find++;
		}

		for(int i:arr3) {
			System.out.print(i+" ");
		}
	}

}
