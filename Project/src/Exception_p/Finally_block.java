package Exception_p;

public class Finally_block {

	public static void main(String[] args) {
	
		try {
			int c=10/0;
		}
		catch(NullPointerException se) {
			System.out.println(se);
		}
		finally{
			System.out.println("i am finally");
		}
		System.out.println("by");
	}

}
