
public class ArrayMock {
	
	public  void show(int arr[]) {
		
		
		for(int i=0;i<arr.length;i++) {
			boolean find=false;
			int count=1;
			
			for(int j=i-1;j>0;j--) {
				if(arr[i]==arr[j]) {
					find=true;
					break;
				}
			}
			
			if(find==false) {
				for(int k=i+1;k<arr.length;k++) {
					if(arr[i]==arr[k]) {
						count++;
					}
					
					
				}
				
				
			}
			int max=arr[arr.length-2];
			System.out.println(max);

		}
		
	}

	public static void main(String[] args) {
		int arr[]= {1,4,7,9,23,15,57};
		ArrayMock a =new ArrayMock();
		a.show(arr);
	}

}
