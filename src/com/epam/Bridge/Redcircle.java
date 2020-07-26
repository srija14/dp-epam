package com.epam.Bridge;

public class Redcircle implements DrawAPI{

	public void drawCricle(int radius, int x, int y) {
		System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", " + y + "]");
	}

}