public class Concepts {
	int var1 = 452;
	
	//should be considered instance variable
	static int var3;
	
	//THIS
	public void demoThis() {
		int var1 = 89;
		var1 = var1; //instanceVariable = localVariable (Shadowing) OUTPUT: 452
		System.out.println(this.var1);
		/*
		int var2 = var1;
		System.out.println(var2); OUTPUT:89
		*/ 
	}
	
	//STATIC
	public static void demoStatic() {
		System.out.println("This is static function ");
		
	}
	public static void main(String args[]) {
		Concepts thisDemo = new Concepts();
		thisDemo.demoThis();
		thisDemo.var3 = 23312;
		
		//can be called using objects , but should be avoided
		//thisDemo.demoStatic();
		//calling static method using classname
		Concepts.demoStatic();
		
	}
}

/*
OUTPUT:
452
This is static function 
*/
