package com.Interface;

 interface ICC {
public void icc();

}

interface BCCI{
	public void bcci();
}


class IPl implements ICC,BCCI{
	
	void ipl(){
		System.out.println("ILP");
	}
	public void icc(){
		System.out.println("unber icc");
	}
	
	public void bcci(){
		System.out.println("unber bcci");
	}
	public static void main(String []args){
		
	}
}