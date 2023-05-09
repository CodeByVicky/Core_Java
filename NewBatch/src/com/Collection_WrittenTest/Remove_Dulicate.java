package com.Collection_WrittenTest;
import java.util.*;
//9.	Write a java program to remove duplicate elements from ArrayList.

public class Remove_Dulicate {

	public static void main(String[] args) {
	
		ArrayList<String>list=new ArrayList<>();
				
		list.add("kalamb");
		list.add("kaj");
		list.add("washi");
		list.add("umarga");
		list.add("tuljapur");
		list.add("umarga");
		list.add("tuljapur");
		
		System.out.println(list);
		
		for(int i=0;i<list.size();i++) {
			boolean find=false;
			int count=1;
			for(int j=i-1;j>=0;j--) {
				if(list.get(i)==list.get(j)) {
					find=true;
					break;
				}
			}
			
			if(find==false) {
				for(int k=i+1;k<list.size();k++) {
					if(list.get(i)==list.get(k)) {
						count++;
					}
				}
				
			}
			if(count!=1) {
				list.remove(i);
				i--;
				
			}
		}
		System.out.println(list);
	}

}
