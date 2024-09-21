package Collections;

public class WrapperDemo {

	public static void main(String[] args) {

		int i = 10;
		Integer int1 = new Integer(i); // Wrapping or auto boxing
		System.out.println(int1);

		int j = int1; // Unwrapping or auto unboxing
		System.out.println(j);

	}

}
