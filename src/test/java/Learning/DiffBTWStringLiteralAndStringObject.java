package Learning;

public class DiffBTWStringLiteralAndStringObject {
	public static void main(String[] args) {

		String str1 = "RCV";
		String str3 = "RCV";

		String str2 = new String("RCV");

		System.out.println(str1 == str3);
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));

	}

}
