package WritternTest;

public class Pattern {
	public static void main (String [] args){
 /*    * * * * *
       * * * *
       * * *
       * *
       *
	*/
		
	/*	int num=5;
		for(int i =num;i>=1;i--){
			for (int j=1;j<=i;j++){
				System.out.print("*");
				
				
			}
			System.out.println();
		}
		
*/		/*
	            1 2 3 4 5
	              1 2 3 4
	                1 2 3
	                  1 2
	                    1

		*/
		
		int num=5;
		
		for(int i=1;i<=num;i++){
			for(int k=1;k<=i;k++){
				System.out.print(" ");
			}
			for (int j=1;j<=6-i;j++){
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
