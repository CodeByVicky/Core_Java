package MarchWritten;

//13.	Assume Emp[] is already present where Emp contains (id,name,sal) in each object.
//Write a function which reverses Emp[] such that 1st element's name goes to last element's name but id and salary will remain as is.
//Similarly for second element and so on. Eg : [{1,"E1",100}, {2,"E2",200},{3,"E3",300}]
//updated to[{1,"E3",100}, {2,"E2",200},{3,"E1",300}] 

class Employee {
	int id;
	String name;
	int salary;

	Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}

public class Reverses_Emp_13 {
	public static void main(String[] args) {

		Employee[] arr = { new Employee(1, "E1", 100), new Employee(2, "E2", 200), new Employee(3, "E3", 300) };

		for (int i = 0; i < arr.length / 2; i++) {
			String j = arr[i].name;
			arr[i].name = arr[arr.length - i - 1].name;
			arr[arr.length - i - 1].name = j;
//			System.out.println(Arrays.toString(empArr));
			for (Employee e : arr) {
				System.out.println(e.id + " " + e.name + " " + e.salary);
			}
		}
	}
}
