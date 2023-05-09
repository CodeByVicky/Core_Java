package com.Collection_WrittenTest;

import java.util.*;

//11.	Create a class shoppingcart with following details - 
//ShoppingCart { int shopid; String custname; List<Item> ,Int qty; String pmode}
//Write method to accept shopping details with list of purchase items and purchase qty.
//If pqty is negative or zero raise customized exception Invalid qty 
//Write a method void generatebill () to display shopping details along with total for Customer.

class Item {
	int qty;

	public Item(int qty) throws Exception {
		super();
		if (qty > 0) {
			this.qty = qty;
		} else {
			throw new Exception();
		}
	}

	@Override
	public String toString() {
		return "Item [qty=" + qty + "]";
	}

}

public class ShoppingCart {
	int shoid;
	String custname;
	List<Item> item;
	String pmode;
	private static List<Item> itemList;
	private static List<Integer> itemQty;

	public ShoppingCart(int shoid, String custname, List<Item> item, String pmode) {
		super();
		this.shoid = shoid;
		this.custname = custname;
		this.item = item;
		this.pmode = pmode;
	}

	@Override
	public String toString() {
		return "ShoppingCart [shoid=" + shoid + ", custname=" + custname + ", item=" + item + ", pmode=" + pmode + "]";
	}

	
	
	public static void main(String[] args) {

		ArrayList<ShoppingCart> list = new ArrayList<>();
		ArrayList<Item> list1 = new ArrayList<>();
		
		Scanner can=new Scanner(System.in);

		try {
			list1.add(new Item(9));
		} catch (Exception e) {
			System.out.println(" Invalid qty");
		}

		list.add(new ShoppingCart(101, "vikcy", list1, "cash"));

		for (ShoppingCart s : list) {
			System.out.println(s);
		}
		for(Item i:list1) {
			int f=i.qty;
			f=f*50;
			System.out.println(f);
		}
		

	}

}
