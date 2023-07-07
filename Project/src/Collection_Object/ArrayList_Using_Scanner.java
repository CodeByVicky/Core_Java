package Collection_Object;
import java.util.*;
class Store{
	String sname;

	public Store(String sname) {
		super();
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "Store [sname=" + sname + "]";
	}
	
}
class Laptop implements Comparable<Laptop>{
	int id;
	String name;
	Store st;
	public Laptop(int id, String name,Store st) {
		super();
		this.id = id;
		this.name = name;
		this.st=st;
	}
	@Override
	public String toString() {
		return "Laptop [id=" + id + ", name=" + name + ",store"+st+"]";
	}
	@Override
	public int compareTo(Laptop o) {
		return o.id-this.id;
	}
	
	
}

public class ArrayList_Using_Scanner {

	public static void main(String[] args) {
		

		ArrayList <Laptop>list=new ArrayList<>();
		
		Scanner can=new Scanner(System.in);
		System.out.println("enter size");
		int size=can.nextInt();
		for(int i=0;i<size;i++) {
			System.out.println("enter id");
			int id=can.nextInt();
			System.out.println("enter name");
			String name=can.next();
			
			System.out.println("enter store name");
			String sname=can.next();
			
			Store st=new Store (sname);
			Laptop lop=new Laptop(id,name,st);
			
			Collections.sort(list);
			Collections.sort(list, new findn());
			list.add(lop);
		}
		
		for(Laptop l:list) {
			System.out.println(l);
		}
	}

}
class findn implements Comparator<Laptop>{

	@Override
	public int compare(Laptop o1, Laptop o2) {
	
		return o1.id-o2.id;
	}


	}
	


















