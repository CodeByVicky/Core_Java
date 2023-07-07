package Final_Exam_Basic;

public class Accending_Using_String {

	public static void main(String[] args) {
		String arr[]= {"mumbai","Delhi","pune","Kolkata","Dharashiv"};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].charAt(0)>arr[j].charAt(0)) {
					String temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.println(arr[i]);
		}

		String min=arr[arr.length-1];
		System.out.println(min);
	}

}
