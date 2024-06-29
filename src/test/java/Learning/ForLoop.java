package Learning;

public class ForLoop {

	public static void main(String[] args) {

		// prefer choice
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		// can be writen this way

		int i = 1;
		for (; i <= 10; i++) {
			System.out.println(i);
		}

		// can also be writen this way
		int i = 1;
		for (; i <= 10;) {
			System.out.println(i);
			i++;
		}

	}

}
