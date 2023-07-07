package Final_Exam_Basic;
import java.util.Scanner;

class Student{
	int id;
	String name;
	char great;
	
	
	Student(int id,String name,char great){
		this.id=id;
		this.name=name;
		this.great=great;
	}
	
	void show(Student []arr) {
		for(Student s1:arr) {
			System.out.println(s1);
		}
	}
	
	public String toString() {
		return id+" "+name+" "+great;
	}
}

public class Student_Array_object {

	public static void main(String[] args) {
		
		Scanner can=new Scanner(System.in);
		
		Student []arr=new Student[10];
		Student s=new Student(0, null, (char) 0);
//		for(int i=0;i<1;i++) {
//			System.out.println("enter id");
//			int id=can.nextInt();
//			
//			System.out.println("enter name");
//			String name=can.next();
//			
//			System.out.println("enter great");
//			char great=can.next().charAt(0);
//			
//			
//			arr[i]=new Student(id,name,great);
//		}
	arr[0]=new Student(1,"vikcy",'A');
	arr[1]=new Student(2,"karan",'B');
	

		for(Student s1:arr) {
			System.out.println(s1);
		}
		

		s.show(arr);
		
		
		
	}

}
