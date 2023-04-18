package com.Constructor;

public interface Baking {
	public void back();
	
	class Stroberry implements Baking{
		@Override
		public void back(){
			System.out.println("Stroberry is red ");
		}
		
	}
	
	class Blueberry implements Baking{
		public void back(){
			System.out.println("Blueberry is black");
		}
	}
 
}
