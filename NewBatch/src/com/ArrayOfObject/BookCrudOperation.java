package com.ArrayOfObject;

import java.util.Scanner;

class Book {

	int id;
	String name;
	float price;
	int currentIndex = 0;

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

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}

public class BookCrudOperation {
//	private int i;
	Book book[] = new Book[10];
	int currentIndex = -1;

	public void addBook(Book b) {
		boolean isBookresent = false;
		for (int i = 0; i < book.length; i++) {
			if (book[i] != null && book[i].getId() == b.getId()) {
				isBookresent = true;
			}
		}
		if (!isBookresent) {
			book[++currentIndex] = b;
			System.out.println("Book Added SuccessFully!!");

		}

		else {
			System.out.println("Book is Already Added!! ");
			System.out.println("Please try with another Book Id");
		}
	}

	void showBooks() {
		boolean isBooksPresent = false;
		for (int i = 0; i < book.length; i++) {
			if (book[i] != null) {
				isBooksPresent = true;
				System.out.println("******** Book " + (i + 1) + " ********");
				System.out.println();
				System.out.println("Book Id ---> " + book[i].getId());
				System.out.println("Book Name ---> " + book[i].getName());
				System.out.println("Book Price ---> " + book[i].getPrice());
			}
		}
		if (!isBooksPresent) {
			System.out.println("No Books are Present to show...");
		}
	}

	Book findBook(int id) {
		Book b = null;
		for (int i = 0; i < book.length; i++) {
			if (book[i] != null) {
				if (book[i].getId() == id) {
					b = book[i];
				}
			}
		}
		return b;
	}

	public void updateBook(int id) {
		Scanner scanner = new Scanner(System.in);

		boolean isBookresent = false;
		int indexUpdate = 0;
		for (int i = 0; i < book.length; i++) {
			if (book[i] != null) {
				if (book[i].getId() == id) {
					isBookresent = true;
					indexUpdate = i;
				}
			}
		}
		if (isBookresent) {
			System.out.println("Enter Updated Book Name");
			book[indexUpdate].setName(scanner.next());

			System.out.println("Enter Updated Book Price");
			book[indexUpdate].setPrice(scanner.nextFloat());
			System.out.println("Book Updated SuccessFully!!...");

		} else {
			System.out.println("No Book is Present With this id " + id);
			System.out.println("Please try with another Book Id");
		}

	}

	public void deleteBook(int id) {
		boolean isBookresent = false;
		Book tempBook[] = new Book[book.length];
		int tempBookIndex = 0;
		for (int i = 0; i < book.length; i++) {
			if (book[i] != null) {
				if (book[i].getId() != id) {
					tempBook[tempBookIndex] = book[i];
					tempBookIndex++;
				} else {
					isBookresent = true;
				}
			}
		}
		if (isBookresent) {
			book = tempBook;
			System.out.println("Book Deleted SuccessFully!!");
		} else {
			System.out.println("No Book is Present With id " + id);
			System.out.println("Please try with another Book Id");
		}

	}

	public static void main(String[] args) {

		BookCrudOperation bkCrudOperation = new BookCrudOperation();
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Enter Your Choice:");
			System.out.println(" 1.Add Book \n 2.Update Book \n 3.Show Books \n 4.Find Book \n 5.Delete Book ");
			int ch = scanner.nextInt();
			switch (ch) {
			case 1: {
				Book bkObjBook = new Book();
				System.out.println("Enter Id");
				bkObjBook.setId(scanner.nextInt());

				System.out.println("Enter Book Name");
				bkObjBook.setName(scanner.next());

				System.out.println("Enter Book Price");
				bkObjBook.setPrice(scanner.nextFloat());
				bkCrudOperation.addBook(bkObjBook);
				break;
			}

			case 2: {
//				Book bkObjBook = new Book();
				System.out.println("Enter Id to Update Book");
				int id = scanner.nextInt();
//				bkObjBook.setId(id);

				bkCrudOperation.updateBook(id);
				break;
			}

			case 3: {
				bkCrudOperation.showBooks();
				break;
			}
			case 4: {
				System.out.println("Enter Id to search a Book");
				Book find=bkCrudOperation.findBook(scanner.nextInt());
				System.out.println(find.getId()+" "+find.getName()+" "+find.getPrice());
				break;
			}
			case 5: {
				System.out.println("Enter Id to Delete a Book");
				bkCrudOperation.deleteBook(scanner.nextInt());
				break;
			}

			default:
				throw new IllegalArgumentException("Unexpected value: " + ch);
			}
			System.out.println();
			System.out.println("Do you want to Continue y/n");
		} while (scanner.next().charAt(0) == 'y' || scanner.next().charAt(0) == 'Y');
	}
}
