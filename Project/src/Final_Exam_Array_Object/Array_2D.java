package Final_Exam_Array_Object;

public class Array_2D {

	public static void main(String[] args) {
	
		int arr[][]= {{1,2,3,0},
		              {4,5,6,0},
		              {7,8,9,0},
		              {10,11,12,0}};		
		
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length;j++) {
			if(i==0 || j==0 || i==arr[i].length-1 || j==arr[j].length-1)
			System.out.print(arr[i][j]+"\t");
			else
				System.out.print("\t");
			
		}
		System.out.println();
	}

	}

}
