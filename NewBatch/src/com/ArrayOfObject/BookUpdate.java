package com.ArrayOfObject;

import java.util.*;

class BookInfo {
	int id;
	String name;
	int price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}

public class BookUpdate {

	static int num;

	private static char key;

	BookInfo arr[] = new BookInfo[2];
	Scanner can = new Scanner(System.in);

	public void setInfo() {

		for (int i = 0; i < arr.length; i++) {
			BookInfo book = new BookInfo();
			System.out.println("enter id");
			book.setId(can.nextInt());

			System.out.println("enter name");
			book.setName(can.next());

			System.out.println("enter salary");
			book.setPrice(can.nextInt());

			arr[i] = book;
		}

	}

	public void showInfo() {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null)
				System.out.println(arr[i].getId() + " " + arr[i].getName() + " " + arr[i].getPrice());
		}

	}

	public void sarch() {
		System.out.println("enter find id number");
		int find = can.nextInt();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				if (arr[i].id == find) {
					System.out.println(arr[i].getId() + " " + arr[i].getName() + " " + arr[i].getPrice());
				}
			}
		}
	}

	public void update() {

		System.out.println("enter id to update book");
		int up = can.nextInt();
		boolean isBookresent = false;
		int indexUpdate = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				if (arr[i].id == up) {
					isBookresent = true;
					indexUpdate = i;
				}
			}
		}

		if (isBookresent) {
			System.out.println("Enter updated book name");
			String uname = can.next();
			arr[indexUpdate].setName(uname);

			System.out.println("enter updated book price");
			int uprice = can.nextInt();
			arr[indexUpdate].setPrice(uprice);
			System.out.println(
					arr[indexUpdate].getId() + " " + arr[indexUpdate].getName() + " " + arr[indexUpdate].getPrice());
			System.out.println("Book Updated SuccessFully!!...");
		} else {
			System.out.println("no book is present with this id" + up);
			System.out.println("Please try with another Book Id");
		}

	}

	public void delet() {

		System.out.println("enter deleted book id");
		int delet = can.nextInt();

		BookInfo tempBook[] = new BookInfo[arr.length];
		boolean isBookresent = false;

		int tempIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				if (arr[i].getId() != delet) {
					tempBook[tempIndex] = arr[i];
					tempIndex++;

				} else {
					isBookresent = true;
				}
			}
		}

		if (isBookresent) {
			arr = tempBook;
			System.out.println("Book daleted successfully");
		} else {
			System.out.println("No Book is Present With id " + delet);
			System.out.println("Please try with another Book Id");
		}

	}

	public static void main(String[] args) {
		Scanner can = new Scanner(System.in);
    	BookUpdate boup = new BookUpdate();
		do{
		System.out.println("1-Set Book\n2-Show Book information\n3-Sarch Book\n4-Update Book\n5-Delet Book");
		int option=can.nextInt();
		switch(option) {
		
		case 1:boup.setInfo();
		break;
		
		case 2:boup.showInfo();
		break;
		
		case 3:boup.sarch();
		break;
		
		case 4:boup.update();
		break;
		
		case 5:boup.delet();
		break;
		
		default : System.out.println("Enter valid Number");
		}
		System.out.println();
		System.out.println("Do you want to Continue y/n");
	} while (can.next().charAt(0) == 'y' || can.next().charAt(0) == 'Y');
		
	}

}
