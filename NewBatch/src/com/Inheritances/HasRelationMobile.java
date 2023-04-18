package com.Inheritances;

class Specification{
	int ram;
	int storage;
	
	public Specification(int ram,int storage){
		this.ram=ram;
		this.storage=storage;
		
	}
	public String toString(){
		return ram+" "+storage;
	}
}

public class HasRelationMobile {
	int model;
	String name;
    Specification sp;
    
    public HasRelationMobile(int model,String name,Specification sp){
    	this.model=model;
    	this.name=name;
    	this.sp=sp;
    	
    }
    public String toString(){
    	return model+" "+name+" "+sp;
    }
    
    
    
	public static void main(String[] args) {
		Specification sp= new Specification(8,128);
		HasRelationMobile mobile=new HasRelationMobile(134,"samsung",sp);
		System.out.println(mobile);
	}

}
