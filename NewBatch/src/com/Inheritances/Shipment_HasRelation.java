package com.Inheritances;

class Order{
	int oId;
	String cName;
	String tName;
	
	public Order(int oId,String cName,String tName){
		this.oId=oId;
		this.cName=cName;
		this.tName=tName;
	}
	
	public String toString(){
		return " "+oId+" "+cName+" "+tName;
	}
	
}
class MyDate{
	int dd;
	int mm;
	int yy;
	public MyDate(int dd,int mm,int yy){
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	
	public String toString(){
		return " "+dd+"/"+mm+"/"+yy;
	}
}

public class Shipment_HasRelation {
	int id;
	Order der;
	MyDate date;
	
	public Shipment_HasRelation(int id,Order der,MyDate date){
		this.id=id;
		this.der=der;
		this.date=date;
		
	}
	public String toString(){
		return " "+id+" "+der+" "+date;
	}

	public static void main(String[] args) {
		
		Order order=new Order(101,"vicky","kalamb"); 
		MyDate mydate=new MyDate(05,04,2023);
		Shipment_HasRelation ship=new Shipment_HasRelation(144,order,mydate);
		System.out.println(ship);
	}

}
