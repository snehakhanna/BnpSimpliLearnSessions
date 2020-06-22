import java.util.*;
public class FactorialOfANumber {
	public static void main( String args[]){
		
			//Used to take input
			Scanner scan = new Scanner(System.in);
			
			//Take the number as input on which factorial needs to be performed
			System.out.println("Enter the number:");
			final int inputNumber=scan.nextInt();
			
			int fact = 1;
			for(int i = 1; i <= inputNumber; i++){
					fact = fact * i;
		}
		System.out.println("The factorial of " +inputNumber +" is: "+fact);
	}
}

/*
OUTPUT:
Enter the number:
5
The factorial of 5 is: 120
*/




