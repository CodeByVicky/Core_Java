package LogicalProgram;

import java.util.Arrays;

public class CutNumberUsingArray {

	public static void main(String[] args) {
		int num = 6391999;
		int temp=num;
		int res=1;
		int result=0;
		int val=1;
		
		
		int count=0;
		while(num!=0) {
			count++;
			num/=10;
			
		}
		int arr[]=new int[count];
		num=temp;
		for(int i=count-1;i>=0;i--) {
			int find=num%10;
			arr[i]=find;
			num/=10;
			
		}
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length-2;i++) {
			 
				res=arr[i]*arr[i+1]*arr[i+2];
				
			if(res>result) {
				result=res;
			}
		}
		System.out.println(result);
	}

}
