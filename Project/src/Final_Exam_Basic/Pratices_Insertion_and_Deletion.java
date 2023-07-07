package Final_Exam_Basic;

import java.util.Arrays;

public class Pratices_Insertion_and_Deletion {

	public static void main(String[] args) {
		int arr[]= new int[10];
		int size=7;
		for(int i=0;i<size;i++) {
			arr[i]=i;
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("\n------------");
		//insertion
		int find=4;
		int val=20;
		
		for(int i=size;i>find;i--) {
			arr[i]=arr[i-1];
		}
		//size--;
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("\n------------");
		
		arr[find]=val;
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		//deletation
		int del=3;
		size++;
		for(int i=del;i<size;i++) {
			arr[i]=arr[i+1];
		}
		
	
		System.out.println("\n------------");
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	}


