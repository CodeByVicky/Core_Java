package com.Xobin;
import java.util.*;
//20. There is a linked list which contains numbers from 1 to 5.{1,4,2,1,3,1,4}.
//  Create a map which contains string which is number in words and number of times that number has appeared in list.E.g.output
//    map for above list will be map{(“one”,3),(“two”,1),(“three”,1),(“four”,2)}.
//    Make use of switch statement to get number in words.[1 M]

public class Number_in_Words {

	public static void main(String[] args) {
		int []arr={1,4,2,1,3,1,4};
		LinkedList<Integer>list=new LinkedList<>();
		
		for(Integer i:arr) {
		//	System.out.println(i);
			list.add(i);
		}
		
		
		 Map<String, Integer> numberMap = new HashMap<>();
	        
	        for (Integer number : list) {
	            String numberWord = convertToWord(number);
	            numberMap.put(numberWord, numberMap.getOrDefault(numberWord, 0) + 1);
	        }
	        
	        System.out.println(numberMap);
	    }
	    
	    private static String convertToWord(int number) {
	        String numberWord;
	        
	        switch (number) {
	            case 1:
	                numberWord = "one";
	                break;
	            case 2:
	                numberWord = "two";
	                break;
	            case 3:
	                numberWord = "three";
	                break;
	            case 4:
	                numberWord = "four";
	                break;
	            case 5:
	                numberWord = "five";
	                break;
	            default:
	                numberWord = "";
	        }
	        
	        return numberWord;
	    }
	
		
	}



