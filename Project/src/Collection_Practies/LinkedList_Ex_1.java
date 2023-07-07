package Collection_Practies;
import java.util.*;
public class LinkedList_Ex_1 {

	public static void main(String[] args) {
		LinkedList<Integer>list=new LinkedList<>();
		list.add(12);
		list.add(34);
		list.add(null);
		list.add(12);
		
		for(Integer i:list) {
			System.out.println(i);
		}
		
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			Object i=itr.next();
			System.out.println(i);
		}
	}

}
