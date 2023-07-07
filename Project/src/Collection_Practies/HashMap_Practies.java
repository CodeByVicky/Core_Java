package Collection_Practies;
import java.util.*;

public class HashMap_Practies {

	public static void main(String[] args) {
		HashMap <Integer,String> list=new HashMap();
		
		list.put(1, "viki");
		list.put(2, null);
		list.put(2, "v");
		

		for(Map.Entry<Integer, String>itr:list.entrySet()) {
			System.out.println(itr.getKey()+" "+itr.getValue());
		}
	}

}
