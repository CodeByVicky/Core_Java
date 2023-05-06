
import java.util.*;
public class RemoveArryList_Elements {

	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<>();
	
		
		for(int i=1;i<=10;i++) {
			list.add(i);
		}
		
			
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i)%2==0) {
				
			list.remove(i);
				i--;
			}
			
		}
		for(Integer i:list) {
			System.out.print(i+" ");
		}
	}

	
}
