package com.String;
/*//5)String s="india is beautiful country"
convert only first letter to captial remaining charcters should be small
o/p India Is Beautiful Country
*/
public class FirstLetterCapital {
	
	
	private static void show(String s) {
		String[] arr=s.split(" ");
		/*
		 * for(int i=0;i<arr.length;i++) { char c=arr[i].charAt(0);
		 * 
		 * String c1=String.valueOf(c).toUpperCase(); String sub=arr[i].substring(1);
		 * System.out.print(c1+sub+" "); }
		 */
		for(int i=0;i<arr.length;i++) {
			String f=arr[i];
		
			String b="";
			
			char []ch=f.toCharArray();
			
			for(int j=0;j<ch.length;j++) {
				if(j==0) {
					ch[j]=(char)(ch[j]-32);
					b=b+ch[j];
					
				}
				else
				{
					b=b+ch[j];
				}
			}
			
			System.out.print(b+" ");
		}
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		String s="india is beautiful country";
		FirstLetterCapital.show(s);

	}

	

}
