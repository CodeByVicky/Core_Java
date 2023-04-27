package com.Exception;




public class ThrowDemo {

	public static void main(String[] args) {
		int c=0;
		
		try {
			c++;
			try {
				c++;
				try {
					c++;
					throw new Exception ();
				}
				catch(Exception e) {
					c++;
					throw e;
				}
				
			}
			catch(Exception e) {
				c++;
				throw e;
			}
		}
			catch(Exception e) {
				c++;
		System.out.println(c);
			}
		}

	}


