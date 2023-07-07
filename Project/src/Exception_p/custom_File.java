package Exception_p;

public class custom_File extends Exception{

	String str;
	public custom_File(String str) {
		this.str=str;
	}
	public String toString() {
		return str;
	}
}
