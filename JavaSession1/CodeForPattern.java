public class CodeForPattern {
	public static void main( String args[]){
			//for rows --
			for( int i = 1; i < 6; i++){
				//for columns |
				for( int j = 1; j <= i ; j++){
					System.out.print(j + " ");
			}
			//helps in going to next line 
			System.out.println();
		}
		
	}

}

/*
OUTPUT:
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
*/
