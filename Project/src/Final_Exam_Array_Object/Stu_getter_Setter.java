package Final_Exam_Array_Object;
import java.util.*;

public class Stu_getter_Setter {
	int id;
	String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Stu_getter_Setter []arr=new Stu_getter_Setter[2];
		Scanner can=new Scanner(System.in);		
		for(int i=0;i<arr.length;i++) {
			Stu_getter_Setter st=new Stu_getter_Setter();
			System.out.println("enter id");
			st.setId(can.nextInt());
			
			System.out.println("enter name");
			st.setName(can.next());
			
			arr[i]=st;
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i].getId()+" "+arr[i].getName());
		}
	
	}

}
