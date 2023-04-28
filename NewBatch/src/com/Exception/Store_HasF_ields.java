package com.Exception;

import java.util.*;

//Create a
//class Store
//which has
//fields like:-noOfItemsAvailable-maximumLevel-minimumLevel 
//Create
//methods in Store class–
//
//addItem(), removeItem,        checkStock()
//a.	While removing Item from stock, It should take care that minimum level Should always be maintained for that item. If it goes below 
//minimum level application should generate  ItemStockUnderFlowException.
//b.	While adding Item to stock, It should take care that maximum level
//Should always be maintained for that item. If it goes above maximum level Application should generate  ItemStockOverFlowException.			

class Store {
	int noOfItemsAvailable;
	int maximumLevel = 9;
	int minimumLevel = 2;

	void addItem(int item) throws Exception {
		noOfItemsAvailable=noOfItemsAvailable+item;
		
		if(noOfItemsAvailable>10) {
			noOfItemsAvailable=noOfItemsAvailable-item;
			throw new Exception();
		}
		else {
			System.out.println("Item add sucessful.....");
		}

	}

	void removeItem(int buy) throws Exception {

		if (noOfItemsAvailable - buy < 2) {
			throw new Exception();
		} else {
			noOfItemsAvailable = noOfItemsAvailable - buy;
			// this.checkStock();
			System.out.println(buy + " " + "Buy item sucessful........");
		}
	}

	void checkStock() {
		System.out.println("Available Stock is :" + noOfItemsAvailable);
	}
}

public class Store_HasF_ields {

	public static void main(String[] args) {
		Scanner can = new Scanner(System.in);
		Store s = new Store();
		String v;

		do {
			System.out.println("1-Add Items\n2-Bay Item\n3-Show Available Stock");
			int num = can.nextInt();

			switch (num) {

			case 1:
				System.out.println("enter Items");
				int item = can.nextInt();

				try {
					s.addItem(item);
				} catch (Exception e) {
					System.out.println("---------------------------------------");
					System.out.println("Stock is Full\nOnly need 10 items");
					System.out.println("----------------------------------------");
				}
				break;

			case 2:
				System.out.println("enter Buy item");
				int buy = can.nextInt();

				try {
					s.removeItem(buy);
				} catch (Exception e) {
					System.out.println("---------------------------------------");
					System.out.println("Out Of Stock");
					System.out.println("---------------------------------------");
				}
				break;

			case 3:
				s.checkStock();
				break;

			default:
				System.out.println("Somthing Wrong Please try again");

			}
			System.out.println("you want to continue press yes");
			v = can.next();
		} while ("yes".equals(v));

	}

}
