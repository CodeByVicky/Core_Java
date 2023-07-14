package LogicalProgram;
// 76=76*76=5776=76
public class AutomorphicNumber {

	public static void main(String[] args) {
		   int num=76;
		   int res=0;
		 
           int temp=num;
         num=num*num;
         int count=0;
          while(num!=0){
        	  int find=num%10;
        	   count++;
        	   int val=10;
        	 res=res+val*find;
        	  if(count==2) {
        		  break;
        	  }
        	  num=num/10;
        	  val=val*10;
          }
           System.out.println(res);
          if(temp==res)
          System.out.println("AutomorphicNumber");
          else
        	  System.out.println("Not AutomorphicNumber");
	}

}
