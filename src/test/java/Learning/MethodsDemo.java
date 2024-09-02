package Learning;

public class MethodsDemo {

	public static void main(String[] args) {
		// you cant access the login in main method because it is not static void methods but can do that creating object of the class. Md.dologin
		//doLogin();

		MethodsDemo md = new MethodsDemo(); // object of the class
		md.doLogin();
		md.doLogin();
		md.doLogin();
		md.doLogout();
		md.doLogout();

	}

	public void doLogin() {//start

		// login code
		System.out.println("Login Successful");
	} //end

	public void doLogout() // you can access the login in logout because they are void methods 
	{//start

		//login code
		doLogin();
		System.out.println("Logout Successful");

	} //end

}
