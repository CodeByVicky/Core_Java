package Practies;

public class starPattern {

	public static void main(String[] args) {
		int num=5;

		for(int i=1;i<=num;i++) {
			for(int k=i;k<=num-1;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		for(int i=num-1;i>=0;i--) {
			for(int k=i;k<=num-1;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

}
