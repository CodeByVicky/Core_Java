package MarchWritten;
import java.util.*;

//23.	Assume TreeSet<Train> is present. Train contains id, name and totalSeats.
//TreeSet should be sorted on totalSeats. 
class Train implements Comparable<Train>
{
	int id;
	String name;
	int totalSeats;
	public Train(int id, String name, int totalSeats) {
		super();
		this.id = id;
		this.name = name;
		this.totalSeats = totalSeats;
	}
	@Override
	public String toString() {
		return "Train [id=" + id + ", name=" + name + ", totalSeats=" + totalSeats + "]";
	}
	@Override
	public int compareTo(Train o) {
		return this.totalSeats-o.totalSeats;
	}
	
	
	

	
}
public class Sorted_on_totalSeats {

	public static void main(String[] args) {
	
	TreeSet<Train> ts=new TreeSet<>();
	ts.add(new Train(1, "Pune express", 223));
	ts.add(new Train(4, "mumbai express", 323));
	ts.add(new Train(3, "delhi express", 250));
	ts.add(new Train(2, "chennai express", 430));

	
	for (Train t : ts) {
		System.out.println(t);
	}

}
}