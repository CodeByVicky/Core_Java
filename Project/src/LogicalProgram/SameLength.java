package LogicalProgram;
//1.	An array contains strings of different lengths. 

//e.g. { ‘I’ , ‘am’ , ‘very’ , ‘smart’ }.Write a program such that 
//array will contain all strings of same length,  
//output – { ‘Iam’ , ‘ver’ , ‘ysm’ , ‘art’ } 
//if array does not contain sufficient characters , replace last chars by #  
//e.g. { ‘I’ , ‘am’ , ‘very’ , ‘good’ }    output  { ‘Iam’ , ‘ver’ , ‘ygo’ , ‘od#’ }

public class SameLength {

	public static void main(String[] args) {

		String arr[] = { "i", "am", "very", "smart","v" };

		String str = "";
		for (int i = 0; i < arr.length; i++) {
			str += arr[i];
		}

		System.out.println(str);
		int a = 3;

		if (str.length() % 3 == 0) {
			for (int i = 0; i < str.length(); i++) {
				if (i == a) {
					System.out.print(" ");
					a += 3;
				}
				System.out.print(str.charAt(i));
			}
		} else {
			int b = 3;
			for (int i = 0; i < str.length(); i++) {
				if (i == b) {
					b += 3;
				}

			}

			b = b - str.length();

			for (int i = 0; i < str.length(); i++) {
				if (i == a) {
					System.out.print(" ");
					a += 3;
				}
				System.out.print(str.charAt(i));
			}
			for (int i = 0; i < b; i++) {
				System.out.print("#");
			}
		}

	}

}
