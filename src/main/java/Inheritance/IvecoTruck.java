package Inheritance;

public class IvecoTruck extends Truck {
	public static void main(String[] args) {

		//multilevel inheritance type

		IvecoTruck ivt = new IvecoTruck();
		ivt.loadCapacity();
		ivt.start();
		ivt.stop();
	}

}
