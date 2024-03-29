package LogicalProgram;

import java.util.Arrays;

//8.	Write a program to find all permutations of string.
//For example, all permutations of string “JSP“are, 
//JSP JPS SJP SPJ PJS PSJ

//Java program to print all permutations of a
//given string.
public class Permutations {

	// Function call
	public static void main(String[] args)
	{
		String str = "JSP";
		int n = str.length();
		Permutations permutation = new Permutations();
		permutation.permute(str, 0, n - 1);
	}

	/**
	* permutation function
	* @param str string to calculate permutation for
	* @param l starting index
	* @param r end index
	*/
	private void permute(String str, int l, int r)
	{
		if (l == r)
			System.out.println(str);
		else {
			for (int i = l; i <= r; i++) {
				str = swap(str, l, i);
				permute(str, l + 1, r);
				str = swap(str, l, i);
			}
		}
	}

	/**
	* Swap Characters at position
	* @param a string value
	* @param i position 1
	* @param j position 2
	* @return swapped string
	*/
	public String swap(String a, int i, int j)
	{
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}
}

//This code is contributed by Mihir Joshi
