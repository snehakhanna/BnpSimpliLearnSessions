import java.util.Scanner;
import java.lang.*;
public class Palindrome {
	public static void main( String args[] ) {
		int temp;
		Scanner scan = new Scanner( System.in );
		System.out.println("Enter the string input : ");
		String userInput = scan.nextLine();
		
		//length of string
		int stringLength = userInput.length();
		
		//start of string
		int stringStart = 0;
		
		//pointing to end of the string
		int stringEnd = stringLength - 1;
		
		//compare start characters with end characters
		while ( stringStart < stringEnd) {
			
		if(userInput.charAt(stringStart) != userInput.charAt(stringEnd)) {
			System.out.println("Not a Palindrome");
		}
		//increment & decrement the pointers to string
		stringStart++;
		stringEnd--;	
		}
		System.out.println("Palindrome");
	}
}

/*
Enter the string input : 
nitin
Palindrome


*/


