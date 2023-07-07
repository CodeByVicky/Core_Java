package MarchWritten;

//4.	Reverse a string preserving space positions [2M] Input : "Help others"

//Output : sreh topleH

public class Reverse_string {
	void show(String str) {
		System.out.println(str);
		int count=0;

		char[] arr = str.toCharArray();
		
		for(int i=0;i<arr.length;i++) {
			if (arr[i] != ' ') {
				
				count++;
			}
			else {
				break;
			}
		}
		System.out.println(count);

		for (int i = str.length() - 1; i >= 0; i--) {
			if (arr[i] != ' ') {
//				for(int j=0;j<str.length();i++) {
//					if(arr[j]==count) {
//						System.out.println(" ");
//					}
//				}
				System.out.print(str.charAt(i));
			}
			if(i==str.length()-count)
			System.out.print(" ");
		}

	}

	public static void main(String[] args) {
		//String str = "intern at geeks";

		Reverse_string re = new Reverse_string();
		//re.show(str);
		
		String input = "Help others";
		char[] characters = input.toCharArray();
		int length = characters.length;
		int start = length - 1;
		int end = length - 1;

		while (start >= 0) {
			if (characters[start] != ' ') {
				char temp = characters[start];
				characters[start] = characters[end];
				characters[end] = temp;
				end--;
			}
			start--;
		}

		String reversedString = new String(characters);
		System.out.println(reversedString);
	}


	}


