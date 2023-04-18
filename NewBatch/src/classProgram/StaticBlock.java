package classProgram;

public class StaticBlock {
	
	static {
		System.out.println("Block1");
	}
	static {
		System.out.println("Block3");
		}
	public static void main(String[] args){
		
	}
	static {
		System.out.println("Block2");
		}

}
