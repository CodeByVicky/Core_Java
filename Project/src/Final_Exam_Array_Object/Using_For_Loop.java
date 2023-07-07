package Final_Exam_Array_Object;
import java.util.*;
public class Using_For_Loop {

	int id;
	String name;
	
	Using_For_Loop(int id,String name){
		this.id=id;
		this.name=name;
	}
	public String toString() {
		return id+" "+name;
	}
	public static void main(String[] args) {
		
		Using_For_Loop []arr=new Using_For_Loop[5];
		
		Scanner can=new Scanner(System.in);
		System.out.println("enter size");
		int size=can.nextInt();

		for(int i=0;i<size;i++) {
			System.out.println("enter id");
			int id=can.nextInt();
			
			System.out.println("enter name");
			String name=can.next();
			
			arr[i]=new Using_For_Loop(id,name);
			
		}
		
//		for(Using_For_Loop fo:arr) {
//			System.out.println(fo);
//		}
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]);
		}
	}

}
