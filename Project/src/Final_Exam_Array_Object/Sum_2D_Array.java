package Final_Exam_Array_Object;

public class Sum_2D_Array {

	public static void main(String[] args) {
		
		int arr[][]= {{1,2,3},{3,4,5}};
		int sum=0;
		int find=1;
		
	
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
//				if(j==0) {
//				System.out.print(arr[i][j]+" ");
//				sum=sum+arr[i][j];
//				if()
//				}
				
				if(find>arr[i][j]) {
					find=arr[i][j];
				}
			}
			System.out.println();
		}
		System.out.println(find);
	}

}
