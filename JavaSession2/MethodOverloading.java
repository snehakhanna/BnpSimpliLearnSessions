public class MethodOverloading {
	public void subtract ( int num1, int num2 ) {
		System.out.println(num1 + num2);
		}
	public void subtract( int num1, int num2, int num3) {
		System.out.println(num1 + num2 + num3);
	}
	public static void main(String args[]) {
		MethodOverloading mo1 = new MethodOverloading();
		MethodOverloading mo2 = new MethodOverloading();
		mo1.subtract( 2, 3 );
		mo2.subtract( 2 , 53, 89 );
	}
}

