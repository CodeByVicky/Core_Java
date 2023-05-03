package com.Interface_Marker_Interface;

public class ClonalableExample_2 implements Cloneable{
	
	int i;
	ClonalableExample_2(int i){
		this.i=i;
	}
	
	public void show() {
		System.out.println(i);
	}
	public static void main(String[] args) throws Exception{
		ClonalableExample_2 cl =new ClonalableExample_2(50);
		cl.show();

		System.out.println("////////////////////");
		
		ClonalableExample_2 cl2=(ClonalableExample_2) cl.clone();
				cl2.show();
		
	}

}
