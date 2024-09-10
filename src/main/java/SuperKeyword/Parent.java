package SuperKeyword;

public class Parent {

	public Parent() {
		System.out.println("Parent constructor");
	}

	public Parent(int i) {
		System.out.println("Parameterised constructor");
	}

	String empName = "Tom";
	int empNo = 123457;

	public void getData() {
		System.out.println(empName);
		System.out.println(empNo);
	}

}
