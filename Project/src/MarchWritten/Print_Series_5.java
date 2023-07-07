package MarchWritten;

//5.	Print below series upto 5 times [1M] 2 10 30 68 130

public class Print_Series_5 {
	void show(int []arr) {
		
		for(int i=0;i<5;i++) {
			for(int number:arr) {
				System.out.print(number+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Print_Series_5 pr=new Print_Series_5();
		
		int []arr= {2,10,30,68,130};
		
		
		
		pr.show(arr);

	}

}
