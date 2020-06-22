public class FibbonacciSeries {
	public static void main (String args[]) {
		int firstFibboNumber=1;
		int secondFibboNumber=1;
		
		//fibbonacci series from 1 to 89
		int inputNumber=11,i;
		for(i = 1; i <= inputNumber; i++){
			
			// initially it is 1(0+1=1)
			System.out.print(firstFibboNumber+" ");
			//since 0+1=1
			int result = firstFibboNumber + secondFibboNumber;
			firstFibboNumber = secondFibboNumber;
			secondFibboNumber = result;
		}
	}
}


/*
OUTPUT:
1 1 2 3 5 8 13 21 34 55 89 
*/
