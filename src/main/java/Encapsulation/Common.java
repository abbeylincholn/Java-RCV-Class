package Encapsulation;

public class Common {

	// lets say you are designing boxies for games, instead of doing it in different classes it should be encapsulate in a class.
	// because the access modifiers for box parameters are public in class common thats why i can access it in class createbox. 
	// So to encapsulate it, then I will change access modifiers for box paramaters to private to secure that variables for the class. 
	// But to then solve for setBoxDimension which requires the access of the varibles l, b, h. That is why SET AND GET Methods comes in....
	// in order to set and get the value of the variables in order class. from line 20

	// NOTE: the lesson here is the private variables cannot be manipulated directly by any other class but anyone want to manipulate it they have to do the set and get methods 

	private int length;
	private int width;
	private int height;

	public void setBoxDimension(int l, int b, int h) {

		if (l >= 1 && b >= 1 && h >= 1) {
			System.out.println("Box created with dimensions " + l + " " + b + " " + h + " ");
		} else {
			System.out.println("Invalid Dimension");
		}
	}

	// That is why SET AND GET Methods comes in....
	// i dont want lenght to be less than or equal to zero then the ifelse statement within the method

	public int setLength(int l) {
		if (l >= 1) {
			length = l;
		} else {
			System.out.println("Invalid length");
		}
		return length;

	}

	public int setWidth(int b) {
		width = b;
		return width;
	}

	public int setHeigth(int h) {
		height = h;
		return height;
	}

	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}

	public int getHeigth() {
		return height;
	}
	// go create box to set and get

}
