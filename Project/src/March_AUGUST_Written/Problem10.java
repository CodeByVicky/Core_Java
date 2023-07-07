package March_AUGUST_Written;
import java.util.*;

public class Problem10 {

		public static void main(String[] args) {
			int[] arr1 = { 1, 3, 5, 7, 9 };
			int[] arr2 = { 2, 4, 6, 8, 10 };
			

			TreeSet<Integer> ts = new TreeSet<Integer>();
			for (int i = 0; i < arr1.length; i++) {
				for (int j = 0; j < arr2.length; j++) {
//					System.err.println(arr1[i]);
//					System.out.println(arr2[j]);
					ts.add(arr1[i]);
					ts.add(arr2[j]);
				}

			}
			System.out.println(ts);
		}
	}