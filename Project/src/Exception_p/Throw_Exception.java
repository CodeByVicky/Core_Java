package Exception_p;

public class Throw_Exception {

	public static void main(String[] args) {
		int age=2;
		if(age<18) {
			try {
				throw new Exception("you are not apply");
			}
			catch(Exception e) {
				System.out.println(e);
			}
			
		}else {
			System.out.println("welcome");
		}

	}

}
