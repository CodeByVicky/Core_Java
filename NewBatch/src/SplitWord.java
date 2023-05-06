
public class SplitWord {

	public static void main(String[] args) {
		String s="india is my country and india is best country ";
		
		String[] arr=s.split(" ");
		
		/*
		 * for(String s1:arr) { System.out.println(s1); }
		 */
		

		for(int i=0;i<arr.length;i++) {
			boolean find =false;
			int count=1;
			for(int j=i-1;j>=0;j--) {
				if(arr[i].equals(arr[j])) {
					find=true;
					break;
				}
			}
			
			if(find==false) {
				for(int k=i+1;k<arr.length;k++) {
					if(arr[i].endsWith(arr[k])) {
						count++;
						
					}
				}
				
				if(count>1) {
					System.out.print(arr[i]+" ");
				}
			}
		}
	}

}
