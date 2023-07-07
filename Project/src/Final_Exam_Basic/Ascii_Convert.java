package Final_Exam_Basic;
import java.util.*;
public class Ascii_Convert {

	public static void main(String[] args) {
		Scanner can=new Scanner(System.in);
//		System.out.println("enter Charator");
//		char ch=can.next().charAt(0);		
//		//System.out.println((int)'z');
//		
//		if(ch>='a' && ch<='z') {
//			System.out.println((char)(ch-32));
//		}
//		else {
//			System.out.println((char)(ch+32));
//		}
		
		
//		System.out.println("enter String");
//		String str=can.next();
//		
//		for(int i=0;i<str.length();i++) {
//			if(str.charAt(i)>='a' && str.charAt(i)<='z') 
//				System.out.print((char)(str.charAt(i)-32));
//			else
//				System.out.print((char)(str.charAt(i)+32));
//		}
		
		int[] a= {85,89,89,67};
		int sum=0;
		int num=1;
		//System.out.println(a.length);
		for(int i=0;i<a.length-1;i++) {
			num*=10;
		}
		
		System.out.println(num);
		
		
		for(int i=0;i<a.length;i++) {
			int find=a[i]%10;
			//System.out.println(find);
			sum=sum+find*num;
			//System.out.println(sum);
			num=num/10;
			//System.out.println(num);
		}
		
	//	System.out.println(sum);
		
	}
	

}
