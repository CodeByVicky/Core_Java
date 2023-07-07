package Final_Exam_Basic;
//9)reverse string word by word

public class Reverse_String {

	public static void main(String[] args) {

		String str = "best in the world";

		String arr[] = str.split(" ");

		for (int i = arr.length - 1; i >= 0; i--) {

			System.out.print(arr[i] + " ");

		}

	}

}
