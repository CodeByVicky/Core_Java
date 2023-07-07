package String_Program;

public class charcter_accending_Oder {

	public static void main(String[] args) {
		String str="best in the word a";
		
		String arr[]=str.split(" ");
		//char arr[]=str.toCharArray();
		
		for(int i=0;i<arr.length;i++) {
	//		if(arr[i].charAt(i)!=' ')
			System.out.println(arr[i]);
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].charAt(0)>arr[j].charAt(0)) {
					String temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
////			if(arr[i].charAt(i)!=' ')
			System.out.print(arr[i]+" ");
		}
		
		
//		System.out.println(str);
//		
//		String arr[]=str.split(" ");
//	//	System.out.println(arr.toString());
//		
//		for(int i=0;i<arr.length;i++) {
//		//if(arr[i].charAt(i)!=' ')
//		System.out.println(arr[i]+" ");
//	}
//		
//		
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
