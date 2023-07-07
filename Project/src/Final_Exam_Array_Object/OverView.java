package Final_Exam_Array_Object;

import java.util.*;

class college {
	String cname;

	public college(String cname) {
		super();
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "college [cname=" + cname + "]";
	}

}

public class OverView {
	int id;
	String name;
	int mark[];
	college cl;

	@Override
	public String toString() {
		return "OverView [id=" + id + ", name=" + name + ", mark=" + Arrays.toString(mark) + ", cl=" + cl + "]";
	}

	public OverView(int id, String name, int[] mark, college cl) {
		super();
		this.id = id;
		this.name = name;
		this.mark = mark;
		this.cl = cl;
	}

	public static void main(String[] args) {

		Scanner can=new Scanner(System.in);
		OverView []arr=new OverView[2];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter id");
			int id=can.nextInt();
			
			System.out.println("enter name");
			String name=can.next();
			
			System.out.println("enter mark");
		int	mark[]=new int[3];
		
			for(int j=0;j<3;j++) {
				mark[i]=can.nextInt();
			}
			System.out.println("enter clg name");
			String cname=can.next();
			
			college co=new college(cname);

			arr[i]=new OverView(id,name,mark,co);
		}
		
		for(OverView o:arr) {
			System.out.println(o);
		}
	}

}
