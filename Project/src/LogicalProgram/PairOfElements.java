package LogicalProgram;
//6.	Find pair of elements in array whose number is given number. 
//e.g. Given array is { 4,5,7,1,2,3,0} If number given is 7.
//Then pairs whose sum is equal to given number are – (4,3) (5,2) (7,0)

public class PairOfElements {

	public static void main(String[] args) {
	     
		int arr[]={4,5,7,1,2,3,0};
		    int find=7;
		
		  for(int i=0;i<arr.length;i++) {
			  for(int j=i+1;j<arr.length;j++) {
				    if(arr[i]+arr[j]==find) {
				    	System.out.print("("+arr[i]+","+arr[j]+")");
				    
				  
				    for(int k=j+1;k<arr.length;k++) {
				    	
				    	if(arr[i]+arr[j]+arr[k]==find) {
				    		
				    		System.out.print("("+arr[i]+","+arr[j]+","+arr[k]+")");
				    	}
				    }   }
			  }
		  }
	}

}
