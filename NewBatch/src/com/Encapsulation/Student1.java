package com.Encapsulation;

public class Student1 {
	
	private int id;
	private String name;
	private String address;
	private double percentage;
	
	public void setId(int id){
		this.id=id;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public void setAddress(String address){
		this.address=address;
	}
	
	public void setPercentage(double percentage){
		this.percentage=percentage;
	}
	
	public int getId(){
		return id;
	}
	
	public String getName(){
		return name;
	}
	
	public String getAddress(){
		return address;
	}
	
	public double getPercentage(){
		return percentage;
	}
	
	void per(){
		boolean find=false;
		
		
		
		if(percentage>50){
		       find= true;
		       System.out.println("placed");
		}
		else if(find!=true)
			System.out.println("Not placed");
		
				
	}
	
	
	public static void main(String [] args){
		Student1 st=new Student1();
		st.setId(101);
		st.setName("vicky");
		st.setAddress("kalamb");
		st.setPercentage(78);
		
		System.out.println(st.getId()+" "+st.getName()+" "+st.getAddress()+" "+st.getPercentage());
		st.per();
	}

}
