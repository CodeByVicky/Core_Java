package com.Interface;
interface bank{
	void show();
}

interface Money{
	void chash();
}

public class InExample implements bank,Money{
	
	public void show(){
		System.out.println("check");
	}

	public void chash(){
		System.out.println("paysa");
	}
	
	
	public static void main(String args []){
		InExample in=new InExample();
		in.show();
		in.chash();
		
	}
}
