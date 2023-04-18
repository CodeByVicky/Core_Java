package com.Constructor;

public class Shopping {
	
	int product_id;
	String product_name;
	int price;
	int qty;
	int total;
	
	public void acceptProductDetails(int pid,String pname,int pprice,int q)
	{
		product_id=pid;
		product_name=pname;
		price=pprice;
		qty=q;
	}
	public void bill()
	{
		if (qty>0)
		{
			total=price*qty;
		//System.out.println(total);
		}
		else
			System.out.println("erroe please enter qty");
		
	}
	public void display(){
		System.out.println(product_id+" "+product_name+"  "+price+"  "+qty+"  "+total);
	}
	

	public static void main(String[] args) {
		
		Shopping sh = new Shopping();
		sh.acceptProductDetails(101, "mobile",  40000,5);
		sh.bill();
		System.out.println("id  product price qty total");
		sh.display();
		

	}

}
