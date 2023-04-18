package WritternTest;

public class Sepratezero {
	/*6) Write a  program to separate zeros from non-zeros in an integer array?
			Input Array : [12, 0, 7, 0, 8, 0, 3]
			Input Array After moving zeros to end :
			[12, 7, 8, 3, 0, 0, 0]*/

	Sepratezero (int arr[])
	{
		
		int countZero=0;
		int countNum=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==0)
				countZero++;
			
			else 
				countNum++;
		}

		
		
		int arrZ[]=new int[countZero];
		int arrN[]=new int [countNum];
			int z=0;
			int n=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==0){
				arrZ[z]=arr[i];
				z++;
			}
			else{
				arrN[n]=arr[i];
			n++;
			}
		}
		int sep[]=new int[arr.length];
		
		for(int i=0;i<arrN.length;i++){
			sep[i]=arrN[i];
		
		}
		for(int i=0;i<arrZ.length;i++){
			
			sep[arrN.length+i]=arrZ[i];
		
		}
		
	for(int i=0;i<sep.length;i++){
			
		System.out.print(sep[i]+" ");
		
		}
		
	}

	public static void main(String[] args) {
		int arr[]={12, 0, 7, 0, 8, 0, 3};
		Sepratezero se=new Sepratezero(arr);
	}
	
	

}
