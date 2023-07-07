package String_Program;

public class Hight_Freques {

	public static void main(String[] args) {

		String str = "best in the world";

		char arr[] = str.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					char temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}
		}
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}

		int max=arr[arr.length-2];
		System.out.println((char)max);
	}
}
