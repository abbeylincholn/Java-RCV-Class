package SuperKeyword;

public class ThisKeyword {

	int x;
	int y;
	int a;
	int b;
	int c;
	String s = "RCV";

	public ThisKeyword() {

		System.out.println("default");
	}

	public ThisKeyword(int x, int y, int a, int b, int c) {

		this.x = x;
		this.y = y;
		this.a = a;
		this.b = b;
		this.c = c;
		System.out.println("default");
		System.out.println("Summation x + y=" + (x + y));
	}

	public static void main(String[] args) {

		ThisKeyword tk = new ThisKeyword(5, 9, 5, 5, 5);
		tk.getData();

	}

	public void getData() {

		int x = 50;
		int y = 40;
		System.out.println("Summation of this.x + this.y =" + (this.x + this.y));
		System.out.println("Summation of this.a + this.b + this.c =" + (this.a + this.b + this.c));
		System.out.println("Summation x + y=" + (x + y));
		this.getData1();
	}

	public void getData1() {

		int x = 50;
		int y = 50;
		System.out.println("Summation of this.x + this.y =" + (this.x + this.y));
		System.out.println("Summation x + y=" + (x + y));

	}

}
