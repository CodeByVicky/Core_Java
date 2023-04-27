package com.String;

public class GretestWord {

	public void display(String s) {
		String [] sp=s.split(" ");
		
		String sortedString="";
		for(int i=0;i<sp.length;i++) {
			for(int j=i+1;j<sp.length;i++) {
				if(sp[i].compareTo(sp[j])>0) {
					String temp=sp[i];
					sp[i]=sp[j];
					sp[j]=temp;
				}
			}
		}
		for(int i=0;i<sp.length;i++) {
			sortedString = sortedString+" "+sp[i];
		}
		System.out.println(sortedString);
	}
	public static void main(String[] args) {
		String s=("pune delhi banglore mumbai");
		GretestWord ge=new GretestWord();
		ge.display(s);
	}

}