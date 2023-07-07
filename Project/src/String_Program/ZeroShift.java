package String_Program;

public class ZeroShift{
    public static void main(String args[]){
      int arr[]={2,5,0,1,0,5,0,8,9};
          int a=1;
          int zero=0;
       //   System.out.print(arr[(arr.length-2)]);
     for(int i=0;i<arr.length;i++){

           if(arr[i]==0){
           zero++;
          for(int j=i;j<arr.length-1;j++){
            arr[j]=arr[j+1];
            }
           // arr[(arr.length-a)]=0;
         
               a++;
             //  System.out.print(arr[(arr.length-a)]);
             
            
         }
           
             
     }
      for(int i=1;i<=zero;i++) {
    	  arr[(arr.length-i)]=0;
      }
     for(int i=0;i<arr.length;i++){
    	 System.out.println();
      System.out.print(arr[i]+" ");
      }
     
     System.out.println(zero);
  
 }
}
