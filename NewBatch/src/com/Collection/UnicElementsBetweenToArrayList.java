package com.Collection;
import java.util.*;
public class UnicElementsBetweenToArrayList {

	void show(ArrayList<String> list,ArrayList<String> list2) {
		
		
		for(int i=0;i<list.size();i++) {
			int count=0;
			for(int j=0;j<list2.size();j++) {
				if(list.get(i)==list2.get(j)) {
					count++;
					break;
				}
			}
			if(count==0) {
				System.out.println(list.get(i)+"\n"+list2.get(i));
				
			}
		}
		
		
		
		
		
		
		
	}
	public static void main(String[] args) {
		
		
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("mango");
		list.add("apple");
		list.add("kiwi");
		list.add("pineapple");
		
		
		ArrayList<String> list2=new ArrayList<String>();
		
		list2.add("mango");
		list2.add("banana");
		list2.add("kiwi");
		list2.add("watermelon");
		
		
		
		
		UnicElementsBetweenToArrayList uni=new UnicElementsBetweenToArrayList();
		uni.show(list,list2);
	}

}
