package map_Practies;
import java.util.*;
public class MapP {

	public static void main(String[] args) {
		
		ArrayList<Integer>list=new ArrayList<>();
		list.add(56);
		list.add(66);
		list.add(90);
		
		ArrayList<Integer>list1=new ArrayList<>();
		list1.add(56);
		list1.add(99);
		list1.add(90);
	
		Map<String,ArrayList<Integer>>map=new HashMap<>();
		Map<String,Integer[]>map1=new HashMap<>();
		Integer arr[]= {1,2,3,4};
		Scanner can=new Scanner(System.in);
//		System.out.println("enter name");
//		String name =can.next();
		
		
		String key = "Key1";
        Integer[] array = {1, 2, 3, 4, 5};
        map1.put(key, array);
		
		map.put("vikcy", list);
		map.put("pratik", list1);
		map1.put("ravi", arr);
//		map.put(null, null);
//		map.put(null, 83);
		
		System.out.println(map);
		System.out.println(map1);
		
//		System.out.println(map.get(name));
	//	System.out.println(map.size());
		
		Integer[] retrievedArray = map1.get(key);
        System.out.println(Arrays.toString(retrievedArray));
        //System.out.println(map1.get(key)+map1.get(value));
	}

}
