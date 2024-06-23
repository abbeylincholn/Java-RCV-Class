package Learning;

public class OperatorsInJava {

	public static void main(String[] args) {

		// Simple assignment operator
		int myNumber = 10;
		String str = "String demo";

		// Arithmetic Operators
		int number1 = 10;
		int number2 = 20;
		number1++;
		number1--;

		boolean bool = !true;

		if (number1 == number2) {
			System.out.println("Numbers are equal");
		} else {
			System.out.println("Numbers are not equal");
		}

		if ((number1 == 10) && (number2 == 20)) {
			System.out.println("This is conditional AND operator");
		}

		if ((number1 == 10) || (number2 == 20)) {
			System.out.println("This is conditional OR operator");
		}

		System.out.println(bool);
		System.out.println(number1 + number2);
		System.out.println(number1 + " " + str);

		System.out.println(number1 / number2);
	}

}
