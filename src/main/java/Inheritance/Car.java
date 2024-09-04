package Inheritance;

public class Car extends VehicleCommon {

	public static void main(String[] args) {

		// car, truck are childs inheriting directly from the parent is hierarchical inheritance
		Car ca = new Car();
		ca.start();
		ca.stop();

	}

}
