package Final_Exam_Basic;

public class Two_Array_equal {

	public static void main(String[] args) {
		int arr1[] = { 12, 22, 32, 42, 52,67};
		int arr2[] = { 52, 22, 67, 12, 32};
		int count=0;
		if(arr1.length==arr2.length) {
			
			for(int i=0;i<arr1.length;i++) {
				for(int j=0;j<arr2.length;j++) {
					if(arr1[i]==arr2[j]) {
						//System.out.println("array is equal");
						count++;
					}
				}
				
			}
			if(count==arr1.length) {
				System.out.println("array is equal");
			}else
				System.out.println("not equal");
			
			
		}else
			System.out.println("not equal");

	}

}
