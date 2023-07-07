package Final_Exam_Basic;

public class Frequency_Array_Charctor {

	public static void main(String[] args) {

		char arr[] = { 'a', 'k', 'c', 'b', 'r', 'n' , 'c', 'b', 'r'};

		for (int i = 0; i < arr.length; i++) {
			boolean find = false;
			int count = 1;
			for (int j = i - 1; j >= 0; j--) {
				if (arr[i] == arr[j]) {
					find = true;
					break;
				}
			}
			if(find==false) {
				for(int k=i+1;k<arr.length;k++) {
					if(arr[i]==arr[k]) {
						count++;
					}
				}
				//System.out.println(arr[i]+"->"+count);
//				if(count>1) {
//					System.out.println(arr[i]);
//				}
				
				if(count==1) {
					System.out.println(arr[i]);
				}
			}
		
		}
	}

}
