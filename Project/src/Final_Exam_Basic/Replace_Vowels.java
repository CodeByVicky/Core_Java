package Final_Exam_Basic;

//7)replace vowels by special characters
public class Replace_Vowels {

	public static void main(String[] args) {
		String str = "best in the world";

		char arr[] = str.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
				System.out.print("@");
			} else {
				System.out.print(arr[i]);
			}
		}

	}

}
