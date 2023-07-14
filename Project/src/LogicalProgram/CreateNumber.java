package LogicalProgram;
import java.util.*;
public class CreateNumber {

	public static void main(String[] args) {
		Scanner can=new Scanner(System.in);
		System.out.println("enter number");
		int num=can.nextInt();
		int a=1;
		for(int i=0;i<num;i++) {
			 a=a*10;
		}
		System.out.println(a);
	}

}
