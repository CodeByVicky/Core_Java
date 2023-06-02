package com.File_Handling;
import java.io.*;

public class Copy_File {

	public static void main(String[] args) throws IOException {
		File f =new File("d:/File_han/Copy_file.txt");
		File f1 =new File("d:/File_han/Copy_file1.txt");
		FileOutputStream fos=new FileOutputStream(f1);
		int x;

		FileInputStream fis=new FileInputStream(f);
	//	System.out.println(fis.available());
		byte arr[]=new byte[fis.available()];
			

		fis.read(arr);
		for(byte b:arr) {
			
			System.out.print((char)b);
		}
		System.out.println();
		System.out.println("file read succesfully.....");
		
		fos.write(arr);
		System.out.println("file written succesfully");
		
	}

}
