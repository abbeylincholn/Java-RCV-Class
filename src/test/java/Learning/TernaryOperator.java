package Learning;

public class TernaryOperator {
	public static void main(String[] args) {

		// variable = (condition) ? TrueExpression : FalseExpression

		int num1 = 20;
		int num2 = 40;

//		if (num1 > num2) {
//			System.out.println("Num1 > Num2");
//		} else {
//			System.out.println("Num1 < Num2");
//		}

		String result = (num1 > num2) ? "Num1 > Num2" : "Num1 < Num2";
		System.out.println(result);

		int result1 = (num1 > num2) ? 1 : 2;
		System.out.println(result1);

		boolean result2 = (num1 > num2) ? true : false;
		System.out.println(result2);

	}

}
