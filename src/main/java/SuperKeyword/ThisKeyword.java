package SuperKeyword;

public class ThisKeyword {

	int x;
	int y;
	String s = "RCV";

	public ThisKeyword() {

		System.out.println("default");
	}

	public ThisKeyword(int x, int y) {

		this.x = x;
		this.y = y;
		System.out.println("default");
		System.out.println(x + y);
	}

	public static void main(String[] args) {

		ThisKeyword tk = new ThisKeyword(5, 9);
		tk.getData();

	}

	public void getData() {

		int x = 50;
		int y = 40;
		System.out.println(this.x + this.y);
		System.out.println(x + y);
		this.getData1();
	}

	public void getData1() {

		int x = 50;
		int y = 40;
		System.out.println(this.x + this.y);
		System.out.println(x + y);
	}

}
