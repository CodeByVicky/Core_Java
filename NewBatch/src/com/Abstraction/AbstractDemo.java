package com.Abstraction;



abstract class Cards{
	abstract void showCard();

    void showBirth(){
    	
    }
}
class BirthdayCard extends Cards{
	
	void showCard(){
		System.out.println("this is birthday card");
	}
}
public class AbstractDemo {

	public static void main(String[] args) {
		BirthdayCard birth = new BirthdayCard();
		birth.showCard();
		
	}

}
