package taskProgram;

public class Task1 {
	

	void findPrimeNumber(){
		//find prime number between 1 to 10
		int count=0,total=0;
		for(int num=1;num<=10;num++)
		{
			boolean isprime=true;
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
				{
					isprime=false;
					break;
				}
				
			}
			if(isprime){
				System.out.println(num);
			 total=total+num;
			 count++;
				
			}
			
		}
		System.out.println("average is :"+(total/count));
		
	}
	
	void printTable()
	{   
		//table 1 to 5
	for(int j=1;j<=10;j++)
	{
		for (int i =1;i<=5;i++){
			
			System.out.print(i+"*"+j+ "="+j*i+"   ");
			 
		}
		System.out.println(" ");
	}
	}
	//create 3 care and display
	int cmodel;
	String cname;
	String ccolor;
	int cprise;
	public void acceptDetails(int model,String name,String color,int prise){
		cmodel=model;
		cname=name;
		ccolor =color;
		cprise=prise;
	}
	
	public void display(){
		System.out.println(cmodel+" "+cname+" "+ccolor+" "+cprise);
	}
	
	public static void main(String[] args) {
		
		Task1 tk= new Task1();
		tk.findPrimeNumber();
		
		System.out.println("---------------------------------------------------------");
		
		tk.printTable();
		Task1 tk1= new Task1();
		Task1 tk2= new Task1();
		
		System.out.println("----------------------------------------------------------");
		
		
		tk.acceptDetails(101, "bmw", "black", 450000);
		tk1.acceptDetails(102, "bmw", "blue", 400000);
		tk2.acceptDetails(103, "bmw", "orange", 200000);
		tk.display();
		tk1.display();
		tk2.display();


	}

}
