package LogicalProgram;
//2.	Write a program to display right bottom triangle of 2 dimensional matrix. 
//e.g.     a   b   c 	
//         d   e   f 
//         g   h   i      
//output will be                        c 
//	                                e   f
//                             g    h   i
// 

import java.util.Arrays;

public class DisplayPattrn {

	public static void main(String[] args) {
	
		char arr[][]= {{'a','b','c'},{'d','e','f'},{'g','h','i'}};
		 
		
		
        
		  for (int i = 0; i < arr.length; i++) {
			  for(int k=i+1;k<arr.length;k++) {
				  System.out.print("  ");
			  }
	            for (int j = arr.length - 1 - i; j < arr.length; j++) {
	                System.out.print(arr[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	}


