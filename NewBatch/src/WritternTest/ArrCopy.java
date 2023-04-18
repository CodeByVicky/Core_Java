package WritternTest;
/*
10) Arr is a two dimensional array as follows. 
Arr = { { 1,2,3,4} , {5,6,7,8}}
Create a new array ArrCopy which should be as follows
ArrCopy = {{4,3,2,1} , { 8,7,6,5}
*/

public class ArrCopy {
	ArrCopy(int arr[][]){
		
		for (int i=0;i<arr.length;i++){
			for(int j=i+1;i<arr.length;j++){
				if(arr[i][j]>arr[i][j]){
					int temp=arr[i][i];
					arr[i][i]=arr[j][j];
					arr[j][j]=temp;
							
				}
			}
			
		}
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				System.out.println(arr[i][j]);
			}
		
		}
	
		
	}
	public static void main(String[] args) {
		int arr[][]={ { 1,2,3,4} , {5,6,7,8}};
		
		ArrCopy ar=new ArrCopy(arr);
	}

}
