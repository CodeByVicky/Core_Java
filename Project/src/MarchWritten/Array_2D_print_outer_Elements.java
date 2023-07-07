package MarchWritten;


//15.	For below 2d Array print outer elements of array [2M] Eg
//
//1 2 3
//
//4 5 6
//
//7 8 9 then print 1 2 3 4 6
//
//7 8 9
//
//Note: Space is present if element is not printed Eg 5 is not printed For 4x4 matrix
//
//Input Matrix:	
//12	34	2	4
//2	90	11	0
//6	19	7	9
//66	41	22	3
//then print	
//12	34	2	4
//2			0
//6			9
//66	41	22	3


public class Array_2D_print_outer_Elements {
	
	void show(int [][] mat) {
		
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
			//	if (i == 0 || j == 0 || i == mat.length - 1 || j == mat[i].length - 1) {
					
					if (i == 0 ||  i==mat.length-1 ||j==0 || j==mat[i].length-1) {
					System.out.print(mat[i][j]+"\t");
				} else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		

		//int mat[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };	
		int mat[][]={
		 {12, 34, 2, 4},
         {2, 90, 11, 0},
         {6, 19, 7, 9},
         {66, 41, 22, 3}};
		Array_2D_print_outer_Elements ar=new Array_2D_print_outer_Elements();
		ar.show(mat);
		
		


	}

}
