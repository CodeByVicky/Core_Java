package Practies;
import java.util.*;

class Moj implements Comparable<Moj>{
	int id;
	String name;
	public Moj(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Moj [id=" + id + ", name=" + name + "]";
	}
	
	public int compareTo(Moj m) {
		return m.id-this.id;
	}
	
	
}
public class Set_Sorting {

	
	public static void main(String[] args) {
		
		HashSet<Moj>set=new HashSet();
		
		set.add(new Moj(1,"vikcy"));
		set.add(new Moj(5,"ravi"));
		set.add(new Moj(3,"kitu"));
		
		
		
		TreeSet<Moj>set1=new TreeSet(set);
		
			for(Moj m:set1) {
			System.out.println(m);
		}
		

	}

}
