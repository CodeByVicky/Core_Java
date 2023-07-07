package MarchWritten;
//

//16.	Create anonymous class by [0.5 M]
//
//a.	Implementing interface
//
//b.	Extending an abstract class.

interface interable {
	void show();
}

abstract class abst {
	abstract void show();
}

public class Anonymous_class {

	public static void main(String[] args) {

		interable inter = new interable() {
			public void show() {
				System.out.println("Implementing interface");
			}
		};

		abst ab = new abst() {
			public void show() {
				System.out.println("Extending an abstract class");
			}
		};

		inter.show();
		ab.show();
	}

}
