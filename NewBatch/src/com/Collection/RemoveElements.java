package com.Collection;
import java.util.*;
public class RemoveElements {
	
	void show(ArrayList<String> list) {
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i).length()>7) {
				
				list.remove(i);
				i--;
			}
			
		}
		System.out.println(list);
	}

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("Monday");
		list.add("Tuesday");
		list.add("wednesday");
		list.add("Thursday");
		list.add("Friday");
		list.add("Saturday");
		list.add("Sunday");
		
		RemoveElements re=new RemoveElements();
		re.show(list);
	}

}
