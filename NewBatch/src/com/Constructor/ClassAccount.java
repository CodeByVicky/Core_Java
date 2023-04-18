package com.Constructor;

import java.util.Scanner;

public class ClassAccount {
	static int cid;
	static String ctype;
	static String cname;
	static int cbalance;
	int with, depo,withdrow,row;

	void acceptdetails(int id, String name, String type, int balance) {

		cid = id;
		cname = name;
		ctype = type;
		cbalance = balance;
	}

	void withdrow(int row) {
		

		if (row <= cbalance) {

			with = cbalance - row;
			System.out.println(cid + " " + cname + " " + ctype + " " + with);
			cbalance = with;

		} else
			System.out.println("Insufficient Amount");
	}

	void deposite(int deposite) {
		depo = cbalance + deposite;
		System.out.println(cid + " " + cname + " " + ctype + " " + depo);
		cbalance = depo;
	}

	void display() {

		System.out.println(cid + " " + cname + " " + ctype + " " + cbalance);

	}
	void createAccount(){
		Scanner can = new Scanner(System.in);
		System.out.println("enter id");
		int id = can.nextInt();

		System.out.println("enter name");
		String name = can.next();

		System.out.println("enter account type");
		String type = can.next();

		System.out.println("enter balance");
		int balance = can.nextInt();
		 
		 this.acceptdetails(id, name, type, balance);
		 this.display();
		
	}
	
	void option(){
		Scanner can = new Scanner(System.in);
		System.out.println("1-Create Account \n2-Withdrow \n3-Deposite \n4-Exit");
		System.out
		.println("--------------------------------------------------");
		int create = can.nextInt();
		ClassAccount op=new ClassAccount();
		switch(create){
		
		case 1:op.createAccount();
	    break;
		
	    case 2: 
		System.out.println("enter withdrow amount");
		int row = can.nextInt();
		op.withdrow(row);
		break;
		
		case 3:
			System.out.println("enter deposite amount");
			int deposite = can.nextInt();
			op.deposite(deposite);
			break;
			
		case 4: System.out.println("Thank you");
		break;
		}
		
	}
		
		
	

	public static void main(String[] args) {
		int choice;
		char cho;
		Scanner can = new Scanner(System.in);
		ClassAccount ac = new ClassAccount();
		

		System.out
				.println("--------------------------------------------------");
		do {
			ac.option();
		
			System.out
					.println("--------------------------------------------------");

			System.out
					.println("1-Do you want to some operation press -Y\n2-exit press any number");
			cho = can.next().charAt(0);

		} while (cho == 'y' || cho == 'Y');

		System.out.println("Thank you");

	}

}
