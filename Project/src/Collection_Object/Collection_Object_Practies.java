package Collection_Object;
import java.util.*;

class College{
	int id;
	String name;
	public College(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "College [id=" + id + ", name=" + name + "]";
	}
	

	
}
public class Collection_Object_Practies {

	public static void main(String[] args) {

		TreeMap<Integer, College> map = new TreeMap();
		
		
		map.put(2, new College(2,"ravi"));
		map.put(3, new College(6,"mahesh"));
		map.put(1, new College(3,"vicky"));
		map.put(5,  new College(5,"kedar"));
		
		
		for(Map.Entry<Integer, College>itr:map.entrySet()) {
			System.out.println(itr.getKey()+" "+itr.getValue());
		}
		
		
	}
}
