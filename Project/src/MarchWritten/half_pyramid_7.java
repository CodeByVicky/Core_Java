package MarchWritten;

//7.	Print Inverted half pyramid using numbers [1M] 
//1 2 3 4 5
// 1 2 3 4
//  1 2 3
//   1 2 
//    1



public class half_pyramid_7 {

	public static void main(String[] args) {
	for(int i=5;i>=1;i--) {
		for(int k=4;k>=i;k--) {
			System.out.print(" ");
		}
	
		for(int j=1;j<=i;j++) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
	}

}
