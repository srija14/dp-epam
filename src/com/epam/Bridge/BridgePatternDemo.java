package com.epam.Bridge;

public class BridgePatternDemo {
	public static void main(String args[]) {
		Shape redCircle = new Circleshape(100,100,10,new Redcircle());
		Shape greenCircle = new Circleshape(100,100,10,new Greencircle());
		
		redCircle.draw();
		greenCircle.draw();
	}
}