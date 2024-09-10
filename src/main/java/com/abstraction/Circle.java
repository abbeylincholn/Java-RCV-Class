package com.abstraction;

public class Circle extends Shapes {

	public static void main(String[] args) {

		Circle c = new Circle();
		c.drawShapes();
		c.colorShapes();
		c.moveShapes();

	}

	@Override
	public void drawShapes() {
		System.out.println("Drawing circle");

	}

	@Override
	public void colorShapes() {
		System.out.println("Coloring circle");
	}

	@Override
	public void moveShapes() {
		System.out.println("Moving circle");

	}

}