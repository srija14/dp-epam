package com.epam.Bridge;

public class Circleshape extends Shape {
	private int x,y,radius;
	
	public Circleshape(int x,int y,int radius,DrawAPI drawAPI) {
		super(drawAPI);
		this.x=x;
		this.y=y;
		this.radius=radius;
		
	}
	
	public void draw() {
		
		drawAPI.drawCricle(radius,x,y);
		
	}
	

}