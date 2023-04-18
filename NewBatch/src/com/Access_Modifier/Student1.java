package com.Access_Modifier;

public class Student1 {
/*	1. Create a class Student with 4 variables called as rollNo, admissionNo, age, 
	courseId. Each of the variables should have one of the access modifier: public, 
	protected, no-access-modifier and private. Add 4 methods in the class: public 
	method doPublic, no access modifier method doDefault, protected method 
	doProtected, private method doPrivate. 

	*/
	
	public int rollNo;
	protected int adnissionNO;
	int age;
	private  int courseId;
	
	public void doPublic(){
		
	}
	
	void doDefault(){
		
	}
	
	protected void doProtected(){
		
	}
	
	private void doPrivate(){
		
		
	}
	
	public static void main(String[] args) {
		Student1 typeStudent = new Student1();
		
	//	i. Try to access all the variables and all the methods in it. Verify the visibility 
	//	against the access modifier table. 
		
		
		System.out.println(typeStudent.rollNo);
		System.out.println(typeStudent.adnissionNO);
		System.out.println(typeStudent.age);
		System.out.println(typeStudent.courseId);
		
    	typeStudent.doPublic();
		typeStudent.doDefault();
		typeStudent.doProtected();
		typeStudent.doPrivate();
			
	}

}
