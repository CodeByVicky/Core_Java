package com.Encapsulation;

public class BookGeterSeter {
	
	private int id;
	private String name;
	private float price;

	
	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return id;
	}
	

	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	
	
	
	public void setPrice(float price){
		this.price=price;
		if (price>500){
			float	price1=price*0.15f;
		this.price=price-price1;
		
		}
	}
	public double getPrice(){
		
		return price;
	}
	public static void main(String[] args) {
		
		BookGeterSeter book=new BookGeterSeter();
		book.setId(101);
		book.setName("vicky");
		book.setPrice(800);
		
		System.out.println(book.getId()+" "+book.getName()+" "+"  book price:"+book.getPrice());
		


	}

}
