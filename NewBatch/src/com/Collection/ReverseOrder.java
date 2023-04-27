package com.Collection;
import java.util.*;

public class ReverseOrder {

	public static void main(String[] args) {
		
		
		ArrayList <Float> f=new ArrayList<Float>();
		
		f.add(56.0f);
		f.add(56.90f);
		f.add(55.87f);
		
		
		ListIterator<Float> itr= f.listIterator(f.size());
		
		/*while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		*/
		while(itr.hasNext()) {
			itr.next();
		}
		
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
	}

}
