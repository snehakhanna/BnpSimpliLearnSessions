public class VariableArgumentDemo {
	int total=1;
	//Variable arguments..in case to avoid redundancy of code considerining function overloading
	public void multiply(int...values) {
		
		//Enhanced For loop
		for (int value: values){
			/*
			Eg addition total+=value;
			total=0 total=0+99=99 total=99+45=144 total=144+12=156
			*/
			//total=1*99,ans1*45,ans2*12
			total*=value;
		}
		System.out.println(total);
}
	
	public static void main(String args[]) {
		VariableArgumentDemo va= new VariableArgumentDemo();
		va.multiply(99,45,12); //OUTPUT:53460
	}
}
