package Collection_Object;
import java.util.*;

class Student implements Comparable<Student>{
	int id;
	String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	public int compareTo(Student s) {
		//return this.id-s.id;
		//return s.id-this.id;
		
		//return this.name.compareTo(s.name);
		return s.name.compareTo(this.name);
	}
	

	public  void show(ArrayList<Student>list) {
		
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			Object s=itr.next();
//			if(id>2) {
//				System.out.println(s);
//			}
		
			System.out.println(s);
		}
	}
	
}
public class ArrayList_Comparible_Comparitor {

	public static void main(String[] args) {

		ArrayList<Student>list=new ArrayList<>();
		list.add(new Student(1,"vicky"));
		list.add(new Student (2,"ramesh"));
		list.add(new Student(5,"kedsar"));
		list.add(new Student(3,"ketan"));
		
		
		//Collections.sort(list);
		
//		Collections.sort(list,new sortchek());
//		for(Student s:list) {
//			System.out.println(s);
//		}
		Student st=new Student(0, null);
		st.show(list);
		
		
		
	}

}


class sortchek implements Comparator<Student>{
	
	public int compare(Student s1,Student s2) {
		//return s1.id-s2.id;
		return s1.name.compareTo(s2.name);
		
	}
}

