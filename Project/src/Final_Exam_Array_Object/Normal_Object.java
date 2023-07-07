package Final_Exam_Array_Object;

public class Normal_Object {
	int id;
	String name;

	Normal_Object(int id, String name) {
		this.id = id;
		this.name = name;

	}

	public String toString() {

		return id+" "+name;
	}

	public static void main(String[] args) {

		Normal_Object []arr=new Normal_Object[2];
		arr[0]=new Normal_Object(1,"vikcy");
		arr[1]=new Normal_Object(2,"ravan");
		
		for(Normal_Object no:arr) {
			System.out.println(no);
		}
		
	}

}
