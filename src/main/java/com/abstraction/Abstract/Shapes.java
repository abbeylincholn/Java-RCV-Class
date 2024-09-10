package com.abstraction.Abstract;

public abstract class Shapes {

	public abstract void drawShapes(); // abstract method

	public abstract void colorShapes();

	public void moveShapes() { // concrete method
		System.out.println("Move Shape");
	}

}
