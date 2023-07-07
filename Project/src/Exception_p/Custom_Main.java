package Exception_p;

public class Custom_Main {
	
	public void show(int a) throws custom_File {
		if(a<18) {
			throw new custom_File("Age is Under");
		}else {
			System.out.println("welcome");
		}
	}

	public static void main(String[] args) {
		
		Custom_Main ma=new Custom_Main();
		try {
			ma.show(19);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		

	}

}
