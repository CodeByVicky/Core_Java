import java.util.*;

public class ArrayList_Example {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();

		list1.add(12);
		list1.add(5);
		list1.add(18);
		list1.add(54);
		list1.add(12);
		list1.add(5);
		list1.add(18);
		list1.add(54);
		list1.add(12);
		list1.add(5);
		list1.add(18);
		list1.add(54);

		ArrayList<Integer> list2 = new ArrayList<>();

		list2.add(7);
		list2.add(19);
		list2.add(1);
		list2.add(7);
		list2.add(19);
		list2.add(1);

		ArrayList<Integer> list = new ArrayList<>();

		Iterator<Integer> itr1 = list1.iterator();
		Iterator<Integer> itr2 = list2.iterator();

		if (list1.size() >= list2.size()) {
			while (itr1.hasNext()) {
				if (itr2.hasNext()) {
					list.add(itr1.next());
					list.add(itr2.next());
				} else {
					list.add(itr1.next());
				}
			}
		} else {

			while (itr2.hasNext()) {
				if (itr1.hasNext()) {
					list.add(itr1.next());
					list.add(itr2.next());
				} else {
					list.add(itr2.next());
				}
			}
		}

		System.out.println(list);

	}

}
