package com.String;

public class HightFrequcesOfCharater {

	public static void show(String s) {

		char arr[] = s.toCharArray();

		int countA = 0;
		char max=0;
		int val=0;
		

		for (int i = 0; i < arr.length; i++) {
			boolean find = false;
			int count = 0;

			for (int j = i - 1; j >= 0; j--) {
				if (arr[i] == arr[j]) {
					find = true;

					break;
				}
			}

			if (find == false) {
				countA++;
				for (int k = 0; k < arr.length; k++) {
					if (arr[i] == arr[k]) {
						/*
						 * if (arr[i] == ' ') { continue; }
						 * 
						 */
						if(max==arr[i]) {
							val++;
						}
						count++;
					}

				}
				System.out.println(arr[i] + "----->" + count);
				
				/*
				 * char ch[] = new char[s.length()]; int num[] = new int[s.length()]; int a = 0,
				 * b = 0;
				 * 
				 * //System.out.println(arr[i] + "----->" + count);
				 * 
				 * for (int j = 0; j < num.length; j++) { ch[a] = arr[i]; num[b] = count; a++;
				 * b++; }
				 */
				/*
				 * for (int j = 0; j <ch.length; j++) { System.out.println(ch[i]+" "+num[i]); }
				 */

			}
			
		}
		System.out.println("Maximum frequency char is:" + max+"===>"+val);
	}

	public static void main(String[] args) {
		String s = "aaaa va";

		HightFrequcesOfCharater.show(s);
	}

}
