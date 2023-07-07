package Final_Exam_Array_Object;
import java.util.*;

class Student{
	int id;
	String name;
	int mark[];
	Student(int id,String name,int mark[]){
		this.id=id;
		this.name=name;
		this.mark=mark;

	}
	public String toString() {
		return id+" "+name+" "+Arrays.toString(mark);
	}
}

public class Array_in_Array {
	

	public static void main(String[] args) {
	
		Student[]arr=new Student[2];
		Scanner can=new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter id");
			int id=can.nextInt();
			
			System.out.println("enter name");
			String name=can.next();
			
			int mark[]=new int[3];
			System.out.println("enter marks");
			for(int j=0;j<mark.length;j++) {
			
				mark[j]=can.nextInt();
				
			}
			
			arr[i]=new Student(id,name,mark);
		}
		
		for(Student s:arr) {
			System.out.println(s);
		}

	}

}
