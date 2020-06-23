public class OptimizeAddition {
	public void add(int num1, int num2 ) {
		System.out.println("The addition of two numbers is : " +Integer.sum(num1, num2));
	}
	public static void main( String args[] ){
		int num1 = Integer.parseInt( args[0] );
		int num2 = Integer.parseInt( args[1] );
		new OptimizeAddition().add( num1, num2);		
	}
}

/*
OUTPUT:
The addition of two numbers is : 5
*/
























*/
