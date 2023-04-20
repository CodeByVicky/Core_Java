package com.String;

public class RemoveVoles {
	
	void show(String str) {
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!='b')
			{
				System.out.println(i);
				
				
			}
			/*
			 * else System.out.println(str);
			 */
		}
		
	}

	public static void main(String[] args) {
		String str=("best in the world");
		
		RemoveVoles re= new RemoveVoles();
		re.show(str);
		

	}

}
