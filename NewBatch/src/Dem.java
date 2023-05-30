import java.util.*;

public class Dem {

	public static void main(String[] args) {
		boolean find = false;

		ArrayList<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(2);

		Scanner can = new Scanner(System.in);
		do {
			 find = false;
			System.out.println("enter id");
			int id = can.nextInt();

			for (int i = 0; i < list.size(); i++) {
				if (list.get(i) == id) {

					find = true;
					System.out.println("id is present enter unique id");
					

				}
			}
			
			 if(find ==false) {
					list.add(id);
					
				}

		} while (find == true);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

}
