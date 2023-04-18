package com.Array;

public class MargeTwoArray {
	void show(int[] a,int[] b){
		int a1 = a.length;
    	int b1 = b.length;

		int c1 = a1 + b1;
    	int[] c = new int[c1];

		for (int i = 0; i < a.length;i++) {
        		c[i] = a[i];
		}
 		for (int i = 0; i < b.length;i++) {
			c[a1 + i] = b[i];
		}
		for (int i = 0; i < c.length;i++) {
			System.out.println(c[i]);
		}

	}

	public static void main(String[] args) {

		int a[] = { 30, 25, 40 };
     	int b[] = { 45, 50, 55, 60, 65 };
		
		MargeTwoArray marge=new MargeTwoArray();
		marge.show(a,b);

		
	}

}
