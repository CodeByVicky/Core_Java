package Final_Exam_Basic;
//duplicate words in a string

public class Duplicate_words {

	public static void main(String[] args) {
		
		String str="i am the best in the world i am ";
		
		String arr[]=str.split(" ");
		
		for(int i=0;i<arr.length;i++) {
			boolean find=false;
			int count=1;
			for(int j=i-1;j>=0;j--) {
				if(arr[i].equals(arr[j])) {
					find=true;
					break;
				}
			}
			
			if(find==false) {
				for(int k=i+1;k<arr.length;k++) {
					if(arr[i].equals(arr[k])) {
						count++;
					}
				}
				if(count>1) {
					System.out.println(arr[i]);
				}
			}
		}

	}

}
