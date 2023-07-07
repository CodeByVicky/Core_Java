package MarchWritten;

import java.util.*;

//21.	Create a queue of strings using linked list. Add 5 strings to 
// this queue – ‘Virat’ , ‘Sachin’,’Ajinkya’ , ‘Kapil’ , ‘Dhoni’.
// 1.	Add ‘Shikhar’ to the queue. Display queue.
// 2.	Use peek method. What will be output.
// 3.	Use poll method. Display queue after poll.
// 4.	Use offer method. Display queue.
// a complete code for above.[2M]

public class Add_5_String_ques21 {

	public static void main(String[] args) {

		Queue<String> que = new LinkedList<>();

		que.add("Virat");
		que.add("Sachin");
		que.add("Ajinkya");
		que.add("Kapil");
		que.add("Dhoni");

		// 1. Add ‘Shikhar’ to the queue. Display queue.

		que.add("Shikhar");

		// 2. Use peek method. What will be output.

		System.out.println(que.peek());
		
		// 3.	Use poll method. Display queue after poll.
		System.out.println(que.poll());
		System.out.println(que);
		
		// 4.	Use offer method. Display queue.
		que.offer("root");
		System.out.println(que);
	
	}

}
