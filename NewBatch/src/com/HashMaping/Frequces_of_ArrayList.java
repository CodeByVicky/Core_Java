package com.HashMaping;
import java.util.*;

public class Frequces_of_ArrayList {

	public static void main(String[] args) {
		
		ArrayList <Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(1);
		list.add(4);
		list.add(6);
		list.add(1);
		list.add(2);

		HashMap<Integer,Integer> hm=new HashMap();
		
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
			
			for(int k=i+1;k<list.size();k++) {
				if(list.get(i)==list.get(k)) {
					count++;
				}
			}
			if(find==false) {
				System.out.println(list.get(i)+" ---->"+count);
				hm.put(list.get(i), count);
			}
		}
		System.out.println(hm);
	}

}
