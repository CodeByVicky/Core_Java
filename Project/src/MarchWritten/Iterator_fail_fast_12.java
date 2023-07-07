package MarchWritten;
import java.util.*;
//12.	Write a code that shows Iterator is fail fast 

public class Iterator_fail_fast_12 {

	public static void main(String[] args) {

		ArrayList<Integer> list= new ArrayList<Integer>();
		
		list.add(12);
		list.add(34);
		list.add(67);
		list.add(90);
		
		
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
			list.add(98);
		}
		
	}

}