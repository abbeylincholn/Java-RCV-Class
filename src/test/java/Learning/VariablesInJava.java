package Learning;

public class VariablesInJava {

	int j = 20; // instance variable 

	public static void main(String[] args) {

		// type varableName = "value";

		// local variables
		int myNumber = 10;
		int myNumber2 = 10;
		char ch = 'A';
		String str1 = "RCV";

		System.out.println(str1 + myNumber);
		System.out.println(myNumber + myNumber2);
		System.out.println(str1 + " " + myNumber); // concatenate

	}

	public void myMethod() {

		// local variable
		int i = 20;

	}

}
