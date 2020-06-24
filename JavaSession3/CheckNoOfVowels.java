import java.util.*;
import java.lang.*;
public class CheckNoOfVowels {
	public static void main(String args[]) {
		//starting pointing to 0
		int i = 0 , count = 0;
		Scanner scan =new Scanner(System.in);
		System.out.println(" Enter the String : ");
		String userInput = scan.nextLine();
		int length = userInput.length();
		
		//count the vowels
		for( i = 0; i < length; i++ )
		{
			char charPoint = userInput.charAt(i);
			if (charPoint == 'a' ||charPoint == 'A' || charPoint == 'e' ||charPoint == 'E' || charPoint == 'i' ||charPoint == 'I'|| charPoint == 'o' || charPoint == 'O' || charPoint == 'u'||charPoint == 'U') {
				count = count + 1;
			}
		}
		System.out.println("The number of vowels present in the string are : " +count );
	}
}
