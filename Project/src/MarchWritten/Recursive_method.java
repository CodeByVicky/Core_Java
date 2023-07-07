package MarchWritten;



public class Recursive_method {

	public static void main(String[] args) {
		printNumber(5);
	}
	
	public static void printNumber(int num) {
		if(num>1) {
			printNumber(num-1);
		}
		System.out.println(num);
	}

}
