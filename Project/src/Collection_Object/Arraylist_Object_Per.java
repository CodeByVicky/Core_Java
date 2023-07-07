package Collection_Object;
import java.util.*;

class Employee{
	int id;
	String name;
	int salary;
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	public static void show(ArrayList<Employee>list) {
		for(Employee e:list) {
			System.out.println(e);
		}
	}
	
	public  void showGreter(ArrayList<Employee>list) {
		for(Employee e:list) {
			if(e.salary>50000) {
				
				e.salary+=(int)(e.salary*0.10f);
				//System.out.println(e.salary);
				System.out.println(e);
			}
				
			
		}
	}
}
public class Arraylist_Object_Per {

	public static void main(String[] args) {
	
		ArrayList<Employee>list=new ArrayList<>();
		
		list.add(new Employee(1,"Vicky",60000));
		list.add(new Employee(2,"Pratik",70000));
		list.add(new Employee(4,"Sakshi",40000));
		list.add(new Employee(8,"Ravi",80000));
		list.add(new Employee(3,"Pranali",50000));
		
		Employee.show(list);
		System.out.println("-----------------");
		Employee em=new Employee(0, null, 0);
		em.showGreter(list);
		
		HashMap<Integer,Employee>map=new HashMap<>();
		int i=1;
		for(Employee e:list) {
			map.put(i, e);
			i++;
		}
		System.out.println("===========================================");

		for(Map.Entry<Integer, Employee>itr:map.entrySet()) {
			System.out.println(itr);
		}
	}

}
