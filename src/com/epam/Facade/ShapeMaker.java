package com.epam.Facade;

public class ShapeMaker {
	private ShapeDraw circle;
	private ShapeDraw rectangle;
	private ShapeDraw square;
	public ShapeMaker() {
		circle = new Circle();
		rectangle = new Rectangleshape();
		square = new Squareshape();
	}

	public void drawCircle() {
		
		circle.draw();
		
	}

	public void drawRectangle() {
		
			rectangle.draw();
	}

	public void drawSquare() {
		square.draw();
		
	}
	
}