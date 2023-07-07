package Collection_Practies;
import java.util.*;

public class TreeMap_Precties {

	public static void main(String[] args) {
		TreeMap <Integer,String>list=new TreeMap();
		
		list.put(1, "vikcy");
		list.put(4, "viki");
		list.put(3,"vki");
		list.put(3,"vkkkk");
	//	list.put(null, null);
		
		for(Map.Entry<Integer, String>itr:list.entrySet()) {
			System.out.println(itr.getKey()+" "+itr.getValue());
		}
	}

}
