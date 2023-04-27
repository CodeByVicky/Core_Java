package com.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PrimeElement {

	

	public void show(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			int count = 0;
			boolean find= false;
			for (int j = 2; j < list.get(i); j++) {
				if (list.get(i) % j == 0) {
					count++;
					find =true;
					break;
				}
			}

			if (find =false) {
				System.out.println(list.get(i)+":"+"Numger is prime");
			}
			else
				System.out.println(list.get(i)+":"+"Number is not prime");
		}
	}

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.add(4);
//		list.add(5);
//		list.add(6);
//		list.add(7);
//		list.add(8);
//		list.add(9);

		Scanner can=new Scanner(System.in);
		PrimeElement pr = new PrimeElement();
		String str;
		
	do {	
		
		
		
		System.out.println("Enter Number");
		list.add(can.nextInt());
		

		System.out.println("88888888888888888888888888888888888888888");
		
		pr.show(list);
		System.out.println("Continue to :yes");
		
		str = can.next();
		
	}while("yes".equals(str));
	
	
	can.close();
	}

}
