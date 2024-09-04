package Polymorphism;

public class MethodOverLoading {

	public static void main(String[] args) {

		MethodOverLoading mo = new MethodOverLoading();
		mo.login(123456, "passwdrd");
		mo.login(12345, "password", 1990);
		mo.login("abbey", "abbey1");

	}

	public void login(String s, String p) {
		System.out.println("Login successful using username and password");
	}

	public void login(int s, String p) {
		System.out.println("Login successful using phonenumber and password");
	}

	public void login(int s, String p, int t) {
		System.out.println("Login successful using phonenumber/pin and password");
	}

}
