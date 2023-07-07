package Collection_Object;
import java.util.*;

public class ArrayTO_MAp {

	public static void main(String[] args) {
		String arr[]= {"one","two","three","four","five"};
		
		HashMap<Integer,String>map=new HashMap<>();
		int i=1;
		for(String s:arr) {
			map.put(i, s);
			i++;
		}

		for(Map.Entry<Integer,String>itr:map.entrySet()) {
			System.out.println(itr);
		}
	}

}
