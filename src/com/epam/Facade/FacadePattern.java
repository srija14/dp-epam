package com.epam.Facade;

public class FacadePattern {
	public static void main(String args[]) {
		ShapeMaker shape = new ShapeMaker();
		shape.drawCircle();
		shape.drawRectangle();
		shape.drawSquare();
	}

}