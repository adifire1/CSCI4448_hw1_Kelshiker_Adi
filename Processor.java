package ooad_1;

import java.util.Scanner;
import java.util.Arrays;

public class Processor {

	
	String Read() {
		Scanner inn = new Scanner(System.in);
	  	String valS  = inn.nextLine(); //get input
	  	return(valS);
	}
	
	String Clean(String s) {
		String nospace = s.replaceAll("\\s", ""); //https://www.geeksforgeeks.org/how-to-remove-all-white-spaces-from-a-string-in-java/
		String cleaned = nospace.toUpperCase(); //use string function inbuilt
		return(cleaned);
				
	}
	
	String Sort(String s) { // https://www.tutorialspoint.com/how-to-sort-a-string-in-java-alphabetically-in-java
	      char charArray[] = s.toCharArray();
	      Arrays.sort(charArray); //use array sort function
	      String sorted = new String(charArray);
	      return(sorted);


	}
	
	String Palindrome(String s) {
		char charArray[] = s.toCharArray();
		int length = charArray.length;
		int ltwo = length*2;
		char chardub[] = new char[ltwo]; //new array to hold double the characters
		for (int i = 0; i < length; i++) //loop to fill new array with same values as old
	      { 		      
				chardub[i] = charArray[i];
				
	      }   
			
		int lDub = chardub.length;
		int chan = length;
		for (int j = length; j <= lDub-1; j++) 
	      { 
				chardub[j] = charArray[chan-1]; //loop to fill second half of new array with same values as old but reverse order
				chan = chan -1;
				
	      }  
		
		

		String conv = new String(chardub); //convert array back to string
		return(conv);
		
	}
	
	void Print(String s) {
	    System.out.println(s); //simple print
	}
	
	public static void main(String[] args) {
		
		Processor paladin = new Processor();
		int start = 0; // question said the loop should happen in main, not in the method
		while(start == 0) {
		    System.out.println("Please enter a string of characters to proceed or empty string to quit");
			String input = paladin.Read();
			if(input == "") { //empty input
				System.out.println("Successfully Quit");
				start = 1;
				break;
			}
			String cleaned = paladin.Clean(input); //all out methods applied
			String sorted = paladin.Sort(cleaned);
			String Palindrome = paladin.Palindrome(sorted);
			paladin.Print(Palindrome);
			
		}
		
	}

}
