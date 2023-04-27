package com.Collection;

import java.util.*;;

public class EvenPositonElements {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList();

		al.add(12);
		al.add(4);
		al.add(67);
		al.add(6);
		al.add(90);
		al.add(89);
		
		
		

		Iterator<Integer> itr = al.iterator();

		while (itr.hasNext()) {

			System.out.println(itr.next());

			if (itr.hasNext()) {
				itr.next();
			} 

			
		}

	}

}
