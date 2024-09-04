package Inheritance;

public class Truck extends VehicleCommon {

	public static void main(String[] args) {

		// single inheritance type

		Truck tk = new Truck();
		tk.start();
		tk.stop();

	}

	public void loadCapacity() {
		System.out.println("Load capacity");
	}

}
