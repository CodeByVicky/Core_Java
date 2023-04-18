package com.String;

import java.util.Arrays;

public class Sorting {
	
	public static void sortingByLength(String s){
		
		String st[]=s.split(" ");
		
		for(int i=0;i<st.length;i++){
			for(int j=i+1;j<st.length;j++){
				if(st[i].length()<st[j].length()){
					String temp=st[i];
					st[i]=st[j];
					st[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(st));
	}

	public static void main(String[] args) {
		String str="best in the world";
		
		Sorting.sortingByLength(str);

	}

}
