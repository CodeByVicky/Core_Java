package com.Collection;
import java.util.*;

public class FailFast_FailSafe {

	public static void main(String[] args) {
		ArrayList <String> list=new ArrayList();
		
		list.add("pune");
		list.add("mumbai");
		list.add("goa");
		
		System.out.println(list);
		
		Iterator <String> itr=list.iterator();
		
		while(itr.hasNext()) {
			String s=itr.next();
			if(s.equals("goa")) {
				//list.remove(s);//fail-fast
				itr.remove();    //fail.safe
			}
		}
		System.out.println(itr.next());
		System.out.println(list);

	}

}
