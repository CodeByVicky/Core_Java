package Final_Exam_Basic;

public class Decending_Array {

	public static void main(String[] args) {
		int arr[]= {3,7,1,2,5,4};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.print(arr[i]+" ");
			
		}

		System.out.println("\n");
		int max=arr[arr.length-3];
		System.out.println(max);
	}

}
