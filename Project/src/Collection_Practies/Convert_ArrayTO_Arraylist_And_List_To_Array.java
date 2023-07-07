package Collection_Practies;
import java.util.*;

public class Convert_ArrayTO_Arraylist_And_List_To_Array {

	public static void main(String[] args) {
		
		String arr[]= {"vicky"};
		
	ArrayList<String> list=new ArrayList<>(Arrays.asList(arr));
	
	System.out.println(list);
	
	//String newArr[]=list.toArray(new String[list.size()]);
	String arr1[]=list.toArray(new String[list.size()]);
	
	for(String s:arr1) {
		System.out.println(s);
	}
		
	}

}
