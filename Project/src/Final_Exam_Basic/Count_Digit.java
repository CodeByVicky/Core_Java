package Final_Exam_Basic;
//8) count digits in a sring
public class Count_Digit {

	public static void main(String[] args) {
		String str="best 16 in2 the8 w5orld";
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='a' && str.charAt(i)<='z' || str.charAt(i)==' ') {
				
			}else {
				count++;
			}
		}
		System.out.println(count);

	}

}
