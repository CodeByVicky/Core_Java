package MarchWritten;
//9. WAP to print the word frequency using map[1 M]E.g.Input:“Nothing is as easy as it looks Nothing”then

//Output:{Nothing=2,is=1,as=2,easy=1,it=1,looks=1}

public class Word_frequency_9 {

	void wordFrequency(String str) {

		String[] temp = str.split(" ");
		
		
	//	System.out.println(temp[0]);

		for (int i = 0; i < temp.length; i++) {
			boolean find = false;
			int count = 1;

			for (int j = i - 1; j >= 0; j--) {
				
				if (temp[i].endsWith(temp[j]) ) {
					
					find = true;
					break;
				}
			}

			if (find == false) {
				for (int k = i + 1; k < temp.length; k++) {
					if (temp[i].endsWith(temp[k]) ) {
						count++;

					}
				}
				System.out.println(temp[i] + "==" + count);
			}

		}
	}

	public static void main(String[] args) {
		Word_frequency_9 word = new Word_frequency_9();

		String str = "Nothing is as easy as it looks Nothing";
		word.wordFrequency(str);
	}

}
