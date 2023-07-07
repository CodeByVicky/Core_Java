package String_Program;

public class Compression {

	public static void main(String[] args) {
		String str="aaaabbbcccddaaba";
		
		char arr[]=str.toCharArray();
		
		char temp=arr[0];
		int count=0;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==temp) {
				count++;
			}else {
				System.out.print((char)temp+""+count);
				temp=arr[i];
				count=1;
				
			}
			
		}
		System.out.print((char)temp+""+count);
		System.out.println();
		
		
		for(int i=0;i<arr.length;i++) {
			boolean find=false;
			int count1=1;
			for(int j=i-1;j>=0;j--) {
				if(arr[i]==arr[j]) {
					find=true;
					break;
				}
			}
			if(find==false) {
				for(int k=i+1;k<arr.length;k++) {
					if(arr[i]==arr[k]) {
						count1++;
					}
				}
				System.out.print(arr[i]+""+count1);
			}
			
			
		}
	}

}
