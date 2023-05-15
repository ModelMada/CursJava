package TemaCourse2;

public class Shape {
	private int length;
	private int width;
	private double radius;
	
	public Shape (int length) {
		this.length=length;
		System.out.println(length);
	}
	
	public Shape (int length, int width) {
		this.length = length;
		this.width = width;
		System.out.println(length);
		System.out.println(width);
	}
	
	public Shape (double Radius) {
		this.radius= radius;
		System.out.println(radius*radius*Math.PI);
	}
	
	public int calculateSquareArea() {
		return length * length;
	}
	
	public int calculateRectagleArea() {
		return length*width;
	}
}
