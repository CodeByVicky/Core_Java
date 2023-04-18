package WritternTest;

import java.util.Scanner;

public class SeriesNumber {
	public SeriesNumber(int num){
		int series = 0;
		for (int i = 1; i <= num; i++) {
			series = (i * i) + (i * i * i);
			System.out.print(series + " ");
		}
	}

	public static void main(String[] args) {

		// 2 12 36 80 150 252....upto 10 terms

		int num = 10;
		SeriesNumber se = new SeriesNumber(num);
	

	}

}
