package com.Constructor;

import java.util.Scanner;

public class Atm {
	 int pin =1444;
	 int balance=1000;
	 int password;
     String uName;
	int wtotal,wdepo;
		
	
	void acceptDitales(){
		
		Scanner can = new Scanner(System.in);
		
		System.out.println("Enter you name");
		String uName=can.next();
		this.uName=uName;
		
		System.out.println("Enter you Password");
		int password=can.nextInt();
		this.password=password;
		
		if(pin==password){
			System.out.println("Welcome!! ");
		}
		else
			System.out.println("Your not correct user");
		
		
				
	}
	
	void choice(){
		Scanner can = new Scanner(System.in);
		System.out.println("enter you choice\n1-withdrow \n2-deposite \n3-check Balance \n4-exit");
		int cho =can.nextInt();
		
		switch(cho){
		
		case 1:
			System.out.println("enter withdrow amount");
			int with=can.nextInt();
			if(with<500){
				this.
				 wtotal=balance-with;
				balance=wtotal;
				System.out.println(uName+" "+"you balance is "+balance);
			}
			else
				System.out.println("insufficient amount!! minimun balance 500 is required");
			
			break;
			
		case 2:
			System.out.println("enter deposite amount");
			int depo=can.nextInt();
			int dtotal=balance+depo;
			balance=dtotal;
			System.out.println(uName+" "+"You Balance Is "+balance);
			
			break;
			
		case 3:
			System.out.println("Your Cuttent Balance Is:"+balance);
			break;
			
		case 4:
			System.out.println("Thank You");
			break;
		
		
			}
	}
	
	
	public static void main(String [] args){
		Atm atm=new Atm();
		int cho1;
	do{
		atm.acceptDitales();
		atm.choice();
		
		
		System.out.println("--------------------------------------------------------------------");
		Scanner can = new Scanner(System.in);
		System.out
		.println("1-Do you want to some operation press -Y\n2-exit press any number");
        cho1 = can.next().charAt(0);
        

           } while (cho1 == 'y' || cho1 == 'Y');
		System.out.println("Thank you");
		}
		
	}


