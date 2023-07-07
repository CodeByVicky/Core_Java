package Exception_p;

class My_Exception extends Exception {
	String newE;
	public My_Exception(String newE) {
		this.newE=newE;
	}
	public String toString() {
		return newE;
	}
	
}

public class Custome_Exception {

	public static void main(String[] args) {

		try {
			throw new My_Exception("invalid");
		} catch (Exception my) {
			System.out.println(my);
		}

	}

}
