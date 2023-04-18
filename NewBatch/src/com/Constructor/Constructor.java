package com.Constructor;

public class Constructor {

	int modelno;
	String car_name;
	int price;

	public Constructor() {

		System.out.println("i am parameterless method");
	}

	public Constructor(int x) {
		System.out.println("i am parameterized method");
	}

	public Constructor(int cmodelno, String ccar_name, int cprice) {
		modelno = cmodelno;
		car_name = ccar_name;
		price = cprice;

	}

	void desplya() {

		System.out.println(modelno + " " + car_name + " " + price);

	}

	public static void main(String[] args) {
		Constructor cs = new Constructor();
		System.out
				.println("----------------------------------------------------");
		Constructor cs1 = new Constructor(10);
		System.out
				.println("----------------------------------------------------");
		Constructor cs2 = new Constructor(101, "bmw", 454000);
		cs2.desplya();
	}

}
