package taskProgram;

public class GirlBirthday {
	
	 static void birthday(){
		int digit=0;
		
		int num=9;
		for(int i=1;i<=num;i++){
			 digit=i*i*i;
			 System.out.print(digit+" ");
		}
		
		
	}

	public static void main(String[] args) {
    /*	GirlBirthday gb=new GirlBirthday();
		gb.Birthday();
		*/
		GirlBirthday.birthday();

	}

}
