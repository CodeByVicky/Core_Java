package com.Access_Modifier;



//b. In same package as Student, create a new class TQPPStudent and extend the 
//Student class

public class TQPPStudent extends Student1 {
/*	
	i. Create a method called as checkStudentVariableAccess in TQPPStudent and try 
	to assign values to the inherited variables in the method. Verify the visibility 
	against the access modifier table
	
*/
	void checkStudentVariableAccess(){
	int	rollNo=10;
		adnissionNO=102;
	    age=25;
		//courseId=2312;
		
	
	}
	
	public static void main(String[] args) {
		Student1 typeStudent = new Student1();
		TQPPStudent tq = new TQPPStudent();
		tq.checkStudentVariableAccess();
		
	
		
		
	
		
		
	

	}

}
