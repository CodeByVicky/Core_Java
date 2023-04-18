package com.Inheritances;

class Address{
	int pin;
	String cname;
	
	public Address(int pin ,String cname){
		this.pin=pin;
		this.cname=cname;
	}
	public String toString(){
		return pin+" "+cname;
	}
}

public class HasRelationPerson {
	
	int id;
	String name;
	Address add;
	
	public HasRelationPerson(int id,String name,Address add){
		this.id=id;
		this.name=name;
		this.add=add;
		
		
	}
	public String toString(){
		return id+" "+name+" "+add;
	}
	
	public static void main(){
		/*HasRelationPerson per=new HasRelationPerson(101,"vicky",new Address(413507,"kalamb"));
		System.out.println(per);
		*/
		
		Address add1=new Address(413507,"kalamb");
		HasRelationPerson per=new HasRelationPerson(101,"vicky",add1);
	System.out.println(per);
		
	}

}
