package MarchWritten;

import java.util.*;

//22. Consider there is already a TreeSet<Integer>created with elements.
//Write a function which will take input as a number or hardcode the number.
//If input number is present in Set then return the number which is present 2 locations after 	
//the matching number.Eg set{14,15,63,78,96,100,112}.I/p 78 then return 100. If 100 is passed it will return null
//as there is no element 2 locations after it

public class Element_2_Locations {

	public static void main(String[] args) {
	Scanner can = new Scanner(System.in);
//		int[] arr = { 14, 15, 63, 78, 96, 100, 112 };
//		TreeSet<Integer> set = new TreeSet<>();
//
//		for (Integer i : arr) {
//			set.add(i);
//		}
//
//		System.out.println("enter number");
//
//		int find = can.nextInt();
//
//		for (Integer tr : set) {
//			// System.out.println(tr);
//			if (tr.equals(find)) {
//				// System.out.println(tr+2);
//			}
//		}
//
//		Iterator itr = set.iterator();
//		while (itr.hasNext()) {
//			Object find1 = itr.next();
//
//			if (find1.equals(find)) {
//				Object find2 = itr.next();
//			//	itr.next();
//				//itr.next();
//
//				if(find2!=null) {
//					System.out.println(find2);
//				}else
//				System.out.println("null");
//			}
//
//		}
		
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(14);
		ts.add(15);
		ts.add(63);
		ts.add(78);
		ts.add(96);
		ts.add(100);
		ts.add(112);

		//int input = 100;
		System.out.println("enter number");
		
				int input = can.nextInt();
		List<Integer> al = new ArrayList<Integer>(ts);
		int position = al.indexOf(input);
		
		
		System.out.println(al.indexOf(input));
		//System.out.println((pos + 2));
	//	System.out.println(al.size());

		if ((position + 2) <= al.size() - 1) {
			System.out.println(al.get(position + 2));
		} else {
			System.out.println("null");
		}
	}

}
