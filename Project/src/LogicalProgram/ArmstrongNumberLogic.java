package LogicalProgram;

public class ArmstrongNumberLogic {

	public static void main(String[] args) {

		int num = 9800817;
		int temp=num;
		int res=0;
		int count=0;
		
		while(num!=0) {
			
			count++;
			num/=-10;
		}
	
		num=temp;
		 while(num!=0) {
			 int find=num%10;
		
			 int mul=1;
			 for(int i=0;i<count;i++) {
				 mul*=find;
			 }
			 res+=mul;
			
			 num/=10;
		 }

		 if(temp==res) 
			 System.out.println("ArmstrongNumber");
		 else 
			 System.out.println("not ArmstrongNumber");
		 
	}

}
