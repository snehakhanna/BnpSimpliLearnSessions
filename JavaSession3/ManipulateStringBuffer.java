import java.lang.*;
public class ManipulateStringBuffer {
	public static void main(String args[]) {
		StringBuffer str = new StringBuffer("Good ");
		str.append("Morning");
		System.out.println(str);	
	}
}

/*
OUTPUT:
Good Morning
*/
