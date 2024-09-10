package SuperKeyword;

public class Child extends Parent {

	public Child() {
		//super();
		super(3);

	}

	String empName = "Abbey";
	int empNo = 36584;

	public static void main(String[] args) {
		Child c = new Child();
		c.getData();

	}

	public void getData() {
		System.out.println(empName);
		System.out.println(empNo);

		//		System.out.println(super.empName);
		//		System.out.println(super.empNo);

		//super.getData();
	}

}
