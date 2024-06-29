package Learning;

public class BreakAndContinue {

	public static void main(String[] args) {
		/*	for (int i = 1; i <= 10; i++) {
		
				if (i == 7) {
					//break;
					continue;
				}
				System.out.println(i);
			}
			System.out.println("Final Statement");
		*/

		for (int day = 1; day <= 8; day++) {

			if (day == 5) {
				//break;
				continue;
			}

			switch (day) {
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;

			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			default:
				System.out.println("None of the cases satisfied");
			}
			System.out.println(day);

		}

	}

}
