package com.abstraction;

public class Rectangle extends Shapes {

	public static void main(String[] args) {

		Rectangle r = new Rectangle();
		r.drawShapes();
		r.colorShapes();
		r.moveShapes();

	}

	@Override
	public void drawShapes() {
		System.out.println("Drawing rectangle");

	}

	@Override
	public void colorShapes() {
		System.out.println("Drawing rectangle");

	}

	@Override
	public void moveShapes() {
		System.out.println("Drawing rectangle");

	}

}
