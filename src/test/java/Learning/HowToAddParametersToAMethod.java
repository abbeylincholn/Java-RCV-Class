package Learning;

public class HowToAddParametersToAMethod {

	public static void main(String[] args) {

		HowToAddParametersToAMethod md = new HowToAddParametersToAMethod();
		md.doLogout();
		md.doLogin();
		System.out.println(md.addNUmber(5, 10));
		md.diffParameters("This is string", 12, 23);

	}

	public void doLogin() {

		System.out.println("Login Successful");
	}

	public void doLogout() {

		doLogin();
		System.out.println("Logout Successful");
	}

	public int addNUmber(int x, int y) {

		int z = x + y;
		return z;

	}

	public void diffParameters(String s, int i, float f) {

		System.out.println(s);
		System.out.println(i);
		System.out.println(f);

	}

}
