package Final_Exam_Basic;

public class Frequency_ {
	public static void main(String args[]) {

		int arr[] = { 2, 4, 5, 4, 3, 1, 4, 5, 6, 3 };

		for (int i = 0; i < arr.length; i++) {
			boolean find = false;
			int count = 1;
			for (int j = i - 1; j >= 0; j--) {
				if (arr[i]==arr[j]) {
					find = true;
					break;
				}
			}
			if (find == false) {
				for (int k = i + 1; k < arr.length; k++) {
					if (arr[i] == arr[k]) {
						count++;
					}
				}
//				if(count==1) {
//					System.out.println(arr[i]);
//				}
				System.out.println(arr[i]+"-->"+count);
			}
			
		}

	}
}
