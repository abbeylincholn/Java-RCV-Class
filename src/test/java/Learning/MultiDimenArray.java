package Learning;

public class MultiDimenArray {

	public static void main(String[] args) {

		int myInt = 2;
		int[] myIntArray = new int[10];
		myIntArray[0] = 10;
		myIntArray[1] = 20;
		myIntArray[2] = 30;
		myIntArray[3] = 40;

		/*	for (int i = 0; i < myIntArray1.length; i++) {
				System.out.println(myIntArray1[i]);
			} */

		int[] myIntArray1 = { 10, 20, 30, 40, 50 };

		int i = 0;
		while (i < myIntArray1.length) {
			System.out.println(myIntArray1[i]);
			i++;
		}
		System.out.println("After while loop");

	}

}
