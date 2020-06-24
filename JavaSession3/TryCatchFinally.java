import java.util.*;
import java.lang.*;
public class TryCatchFinally {
	public static void main(String args[]) {
		System.out.println("Enter your input for division : ");
		Scanner scan = new Scanner( System.in );
		int result = 0;
		try {
			int input = scan.nextInt();
			result = input / 2;
			System.out.println("The result is : " + result);
		}
		catch(InputMismatchException e){
			System.out.println("Invalid Input");	
		}
		finally {
			System.out.println("Successful");
		}
	}
}
/*
OUTPUT:
Enter your input for division : 
2
The result is : 1
Successful

OUTPUT:
Enter your input for division : 
sneha
Invalid Input
Successful




*/