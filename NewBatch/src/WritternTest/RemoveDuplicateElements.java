package WritternTest;

public class RemoveDuplicateElements {
	/*7) Write a  program to remove duplicate elements from an array?
			Array With Duplicates : [4, 3, 2, 4, 9, 2]
			Array Without Duplicates : [4, 3, 2, 9]*/
	
	
	RemoveDuplicateElements(int arr[]){
		
		int dup[]=new int[4];
		int e=0;
		
		for(int i=0;i<arr.length;i++){
			boolean find=false;
			int count=1;
			for(int j=i-1;j>=0;j--){
				if(arr[i]==arr[j]){
					find=true;
					break;
				}
			}
			
			if(find==false){
				count++;
				dup[e]=arr[i];
				e++;
				
			}
			
			
				
			}
		for(int i=0;i<dup.length;i++ ){
			System.out.print(dup[i]+" ");
		}
		
	}
	
	
	public static void main(String[] args) {
	     int arr[]={4, 3, 2, 4, 9, 2};
	     
	     RemoveDuplicateElements re=new RemoveDuplicateElements(arr);
	}

}
