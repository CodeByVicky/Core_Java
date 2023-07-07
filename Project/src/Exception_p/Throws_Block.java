package Exception_p;

public class Throws_Block {
	void show(int age) throws Exception{
		if(age<18) {
			throw new Exception();
			
		}else {
			System.out.println("welcom");
		}
	}

	public static void main(String[] args) throws Exception {
		Throws_Block th=new Throws_Block();
		try {
			th.show(12);
		}catch(Exception e) {
			//System.out.println(e);
		}
	System.out.println("by");	
	}

}
