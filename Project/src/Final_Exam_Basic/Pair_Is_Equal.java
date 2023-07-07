package Final_Exam_Basic;

public class Pair_Is_Equal {

	public static void main(String[] args) {
	
		int arr[]= {3,6,8,2,5,7};
		
		int find=10;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==find) {
					System.out.println(arr[i]+"-"+arr[j]);
				}
			}
		}

	}

}
